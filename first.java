// Дана строка sql-запроса "select * from students WHERE ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
// Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow


public class first {
     public static void main(String[] args){

 StringBuilder sql_req = new StringBuilder ("select * from students where ");
        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        filter = filter.replace("{", "").replace("}", "").replace("\"", "").replace(" ", "");

        String[] arr_filter = filter.split(",");
        for (int n  = 0; n < arr_filter.length; n++){
            if (arr_filter[n].contains("null")) continue;
            else{
                sql_req.append(arr_filter[n].replace(":", "=") + ", ");
            }
        
        }
        sql_req.delete(sql_req.length()-2, sql_req.length());
        System.out.println(sql_req);
    }
}
