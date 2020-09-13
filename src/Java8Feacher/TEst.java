


package Java8Feacher;


/*
class TestDeadlockExample1 {
    public static void main(String[] args) {
     final    String fst = "java";
    final     String sec = "net";
        Thread thread= new Thread ()
        {
            public void run()
            {
                synchronized (fst)
                {
                    System.out.println ("thread 1 locked");
                }

                try {
                    Thread.sleep (100);
                } catch (Exception e) {
                }

                synchronized (sec)
                {
                    System.out.println ("thread 2 locked");
                }

                try {
                    Thread.sleep (100);
                } catch (Exception e) {
                }

            }
        };


        Thread thread2= new Thread ()
        {
            public void run()
            {
                synchronized (sec) {
                    System.out.println ("thread 1 locked");
                    synchronized (fst) {
                        System.out.println ("thread 2 locked");
                    }
                }
            }
        };
        thread.start ();
        thread2.start ();
    }
}

*/



class TestDeadlockExample1 {
    public static void main(String[] args) {
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread () {
            public void run() {
                synchronized (resource1) {
                    System.out.println ("Thread 1: locked resource 1");

                    try {
                        Thread.sleep (100);
                    } catch (Exception e) {
                    }

                    synchronized (resource2) {
                        System.out.println ("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread () {
            public void run() {
                synchronized (resource2) {
                    System.out.println ("Thread 2: locked resource 2");

                    try {
                        Thread.sleep (100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println ("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start ();
        t2.start ();
    }
}
