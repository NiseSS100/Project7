package fmi.informatics.gui;
import javax.swing.table.AbstractTableModel;
import fmi.informatics.extending.Person;

public class DataModel extends AbstractTableModel {
        private static final long serialVersionUID = 1L;

    private Person[] person;

    public DataModel(Person[] person) {
        this.person = person;
    }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public int getRowCount() {
            return person.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return person[rowIndex].getFirstName();
                case 1:
                    return person[rowIndex].getSecondName();
                case 2:
                    return person[rowIndex].getLastName();
            }
            return null;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "Име";
                case 1:
                    return "Презиме";
                case 2:
                    return "Фамилия";
                default:
                    return super.getColumnName(column);
            }
        }
}

