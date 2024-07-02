importjava.util.Scanner;

publicclassBirthDay {
    privateStringname;
    privateintbirthMonth;
    privateintbirthDay;
    privateintbirthYear;

    publicBirthDay(Stringname, intbirthMonth, intbirthDay, intbirthYear) {
        this.name=name;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
    }

    publicStringgetUsaFormat() {
        returnString.format("%d/%d/%d", birthMonth, birthDay, birthYear);
    }

    publicStringgetUkFormat() {
        returnString.format("%d/%d/%d", birthDay, birthMonth, birthYear);
    }

    publicstaticvoidmain(String[] args) {
        Scannerscanner=newScanner(System.in);

        try {
            StringmyInput=scanner.nextLine();
            String[] myParts=myInput.split(",");
            if (myParts.length!=4) {
                thrownewIllegalArgumentException("Invalid Input");
            }
            
            StringmyName=myParts[0];
            intmyBirthMonth=Integer.parseInt(myParts[1]);
            intmyBirthDay=Integer.parseInt(myParts[2]);
            intmyBirthYear=Integer.parseInt(myParts[3]);
            
            if (myBirthMonth<1||myBirthMonth>12||myBirthDay<1||myBirthDay>31||myBirthYear<1950||myBirthYear>2024) {
                thrownewIllegalArgumentException("Invalid Input");
            }

            StringfriendInput=scanner.nextLine();
            String[] friendParts=friendInput.split(",");
            if (friendParts.length!=4) {
                thrownewIllegalArgumentException("Invalid Input");
            }

            StringfriendName=friendParts[0];
            intfriendBirthMonth=Integer.parseInt(friendParts[1]);
            intfriendBirthDay=Integer.parseInt(friendParts[2]);
            intfriendBirthYear=Integer.parseInt(friendParts[3]);
            
            if (friendBirthMonth<1||friendBirthMonth>12||friendBirthDay<1||friendBirthDay>31||friendBirthYear<1950||friendBirthYear>2024) {
                thrownewIllegalArgumentException("Invalid Input");
            }

            BirthDaymyBirthday=newBirthDay(myName, myBirthMonth, myBirthDay, myBirthYear);
            BirthDayfriendBirthday=newBirthDay(friendName, friendBirthMonth, friendBirthDay, friendBirthYear);

            System.out.println("In the USA my birthday is: "+myBirthday.getUsaFormat());
            System.out.println("In England my birthday is: "+myBirthday.getUkFormat());
            System.out.println("In the USA my friend "+friendName+"'s birthday is: "+friendBirthday.getUsaFormat());
            System.out.println("In England my friend "+friendName+"'s birthday is: "+friendBirthday.getUkFormat());
            
        } catch (Exceptione) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}
