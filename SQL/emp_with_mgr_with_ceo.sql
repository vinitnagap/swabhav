Select t1.ename, t2.ename as boss from emp t2 right join emp t1
on t2.EMPNO = t1.MGR;