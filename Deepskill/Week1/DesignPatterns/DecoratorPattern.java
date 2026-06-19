interface Notifier {
    String send();
}
class EmailNotifier implements Notifier{
    public String send()
    {
        return "Sending..";
    }
}
abstract class NotifierDecorator implements Notifier{
    


}
class SMSNotifierDecorator extends NotifierDecorator{
    Notifier not;
    SMSNotifierDecorator(Notifier not)
    {
        this.not=not;
    }
    public String send()
    {
        return not.send()+"SMS";
    }
}

class SlackNotifierDecorator extends NotifierDecorator{
    Notifier not;
    SlackNotifierDecorator(Notifier not)
    {
        this.not=not;
    }
    public String send()
    {
        return not.send()+"Slack";
    }
}

class Test{
    public static void main(String[] args)
    {
        Notifier not=new EmailNotifier();
        System.out.println(not.send());
        not=new SMSNotifierDecorator(not);
        System.out.println(not.send());
        not=new SlackNotifierDecorator(not);
        System.out.println(not.send());

    }
}



