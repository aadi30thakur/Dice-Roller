import random

inp = "y"
while inp == "y":
    num = random.randint(1, 6)
    switch = {
        1: '''
        ---------
        |       |
        |   0   |
        |       |
        ---------
        ''',
        2: '''
        ---------
        | 0     |
        |       |
        |     0 |
        ---------
        ''',
        3: '''
        ---------
        | 0     |
        |   0   |
        |     0 |
        ---------
        ''',
        4: '''
        ---------
        | 0   0 |
        |       |
        | 0   0 |
        ---------
        ''',
        5: '''
        ---------
        | 0   0 |
        |   0   |
        | 0   0 |
        ---------
        ''',
        6: '''
        ---------
        | 0   0 |
        | 0   0 |
        | 0   0 |
        ---------
        ''',
    }
    print(switch.get(num))
    a = input("Roll dice again (y/n)")
    inp = a.lower()
