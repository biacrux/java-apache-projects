package mylists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedSortedList<E extends Comparable<E>> implements SortedList<E> {

    private Node<E> head;
    private int size;

    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E element) {
            this.element = element;
            this.next = null;
        }
    }

    public LinkedSortedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E e) {
        if (e == null) return false;

        // Inserção no início (ou se lista vazia)
        if (head == null || e.compareTo(head.element) < 0) {
            Node<E> newNode = new Node<>(e);
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        }

        // Rejeitar duplicado no início
        if (e.compareTo(head.element) == 0) return false;

        Node<E> current = head;
        // Percorrer até encontrar a posição correta
        while (current.next != null && e.compareTo(current.next.element) > 0) {
            current = current.next;
        }

        // Rejeitar duplicado no meio ou fim
        if (current.next != null && e.compareTo(current.next.element) == 0) {
            return false;
        }

        // Inserir na posição
        Node<E> newNode = new Node<>(e);
        newNode.next = current.next;
        current.next = newNode;
        size++;
        return true;
    }

    @Override
    public E get(int i) {
        if (i < 0 || i >= size) return null;
        Node<E> current = head;
        for (int k = 0; k < i; k++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E remove(int i) {
        if (i < 0 || i >= size) return null;
        E removed;
        if (i == 0) {
            removed = head.element;
            head = head.next;
        } else {
            Node<E> prev = head;
            for (int k = 0; k < i - 1; k++) {
                prev = prev.next;
            }
            removed = prev.next.element;
            prev.next = prev.next.next;
        }
        size--;
        return removed;
    }

    @Override
    public int indexOf(E e) {
        if (e == null) return -1;
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            int cmp = current.element.compareTo(e);
            if (cmp == 0) return index;
            if (cmp > 0) return -1; // Como está ordenada, se for maior já não encontra
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                E data = current.element;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public String toString() {
        String texto = "[";
        Node<E> current = head;
        while (current != null) {
            texto += current.element;
            if (current.next != null) {
                texto += ", ";
            }
            current = current.next;
        }
        texto += "]";
        return texto;
    }

    // --- MÉTODOS NÃO IMPLEMENTADOS (REGRA 6 DO ENUNCIADO) ---

    @Override
    public void addAll(SortedList<E> other) {
        throw new UnsupportedOperationException("Método não implementado!");
    }

    @Override
    public void removeAll(SortedList<E> other) {
        throw new UnsupportedOperationException("Método não implementado!");
    }

    @Override
    public boolean containsAll(SortedList<E> other) {
        throw new UnsupportedOperationException("Método não implementado!");
    }

    @Override
    public SortedList<E> clone() {
        throw new UnsupportedOperationException("Método não implementado!");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Método não implementado!");
    }
}