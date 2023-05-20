public interface Expression {
    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     */
    public boolean interpret(Context ctx);

    public String toString();
}