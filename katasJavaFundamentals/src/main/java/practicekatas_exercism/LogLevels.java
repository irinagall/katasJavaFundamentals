package practicekatas_exercism;

/* Instructions

In this exercise you'll be processing log-lines.

Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".

There are three different log levels:

    INFO
    WARNING
    ERROR

You have three tasks, each of which will take a log line and ask you to do something with it.

TASK1: Implement the (static) LogLevels.message() method to return a log line's message:

LogLevels.message("[ERROR]: Invalid operation")
// => "Invalid operation"

Any leading or trailing white space should be removed:

LogLevels.message("[WARNING]:  Disk almost full\r\n")
// => "Disk almost full"


TASK2: Implement the (static) LogLevels.logLevel() method to return a log line's log level, which should be returned in lowercase:

LogLevels.logLevel("[ERROR]: Invalid operation")
// => "error"


TASK3: Implement the (static) LogLevels.reformat() method that reformats the log line, putting the message first and the log level after it in parentheses:

LogLevels.reformat("[INFO]: Operation completed")
// => "Operation completed (info)"




 */

public class LogLevels {

    public static String message(String logLine) {
        int firstOccurrenceOfColon = logLine.indexOf(":");
        String processedString = logLine.substring(firstOccurrenceOfColon + 1);
        return processedString.trim();
    }


    public static String logLevel(String logLine) {
        int firstOccurenceOfSquareBrakets = logLine.indexOf("[");
        int lastOccurenceOfSquareBrakets = logLine.indexOf("]");
        String processedString = logLine.substring(firstOccurenceOfSquareBrakets + 1, lastOccurenceOfSquareBrakets);
        return processedString.toLowerCase();

    }

    public static String reformat(String logLine) {

        String messageToBeConcatenatedToLogType = message(logLine);
        String logTypeToBeConcatenatedToMessage = logLevel(logLine);


        return messageToBeConcatenatedToLogType + " (" +logTypeToBeConcatenatedToMessage +")";
    }
}
