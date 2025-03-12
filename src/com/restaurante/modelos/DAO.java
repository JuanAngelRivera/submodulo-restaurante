package src.com.restaurante.modelos;

import javafx.collections.ObservableList;

public abstract class DAO <T>
{
    public abstract void INSERT();
    public abstract void UPDATE();
    public abstract void DELETE();
    public abstract ObservableList<T> SELECT();
}
