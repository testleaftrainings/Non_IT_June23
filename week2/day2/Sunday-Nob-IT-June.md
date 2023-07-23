Todays Agenda:

    8:45-9:00-Recap
    9:00-10:20-Basic Xpath
    10:35-11:05-Classroom+Break
    11:00-11:30-Implicitly Wait + webDriver methods
    11:30-12:10-Advanced Xpath
    12:10-12:35-Classroom +Break
    12:35-01:10-Continue Xpath
    01:10-01:15-Recap
    
XPath-index will start with'1'

Absolute-xpath
*long xpath
*start from '/' to the target element 
example 
/html/body/div[2]/div[2]/div/form/p/input


Relative xpath

//tagname[@Attributename='Attributevalue']

Basic xpath

Attribute based xpath
============================

//tagname[@attname='attvalue']

ex:
//input[@id='username']
//input[@id='twotabsearchtextbox']


TextBased xpath
==========================

//tagname[text()='textvalue']

ex:
//a[text()='Create new account']
//a[text()='Sell']

parital Attribute based xpath
=================================

//tagname[contains(@attname,'attvalue')]

ex:
//input[contains(@id,'search')]
//button[contains(@name,'in')]

parital Text based xpath
===============================

//tagname[contains(text(),'textvalue')]
ex:
//a[contains(text(),'CRM/SFA')]
//span[contains(text(),'Home')]

Index or collection based xpath
=====================================

(//tagname[@att='attvalue'])[index value]
index should not go beyond '5'
index with'1'
1-5

ex:
(//span[contains(text(),'Home')])[5]
(//input[@class='inputLogin'])[2]

Implicity wait:

findelement 
findelements 


Adv xpath

1.parent to child

basic xpath(parent)/tagname of child
ex:
//p[@class='top']/input
//div[@class='nav-search-field ']/input

2.GrandParent to GrandChild
basic xpath(gp)//tagname of gc

ex:
//form[@class='_9vtf']//button

3.child to parent
basic xapth(child)/parent::tagname parent 
ex:
//button[@name='login']/parent::div
//input[@id='username']/parent::div

4.Gc to Gp

Gc basic xpath/ancestor::tagname Gp

ex:
(//a[contains(text(),'CRM/SFA')]/ancestor::div)[4]

5.Elder sibling to younger sibling
ES basic xpath//following-sibling::YS tagname
ex:
//label[text()='Username']/following-sibling::input
//div[text()='Surname']/following-sibling::input


6. Ys to Es
Ys Basic xpath/preceding-sibling::Es tagname
ex:
//input[@id='username']/preceding-sibling::label

7.Elder cousin to Younger cousin

EC basic xpath /following::tagname of YC

8.YC to EC
YC basic xapth/preceding:: tagname of EC
