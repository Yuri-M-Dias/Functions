public static String formataData(String data) throws Exception {
    if (data == null || data.equals(""))
        return null;
    Date date = null;
    DateFormat formatter; 
    try {
        formatter = new SimpleDateFormat("HH:mm:ss");
        date = (java.util.Date) formatter.parse(data);
    } catch (ParseException e) {
        throw e;
    }
    return formatter.format(date);
}

* Mesmo método com poucas linhas mas retornando null:

public static LocalTime formataData(String data) throws Exception {
    if (data == null || data.equals(""))
        return null;
    LocalTime lt = LocalTime.parse(data);
    return lt;
}
