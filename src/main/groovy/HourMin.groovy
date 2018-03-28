import java.util.logging.Handler

class HourMinute {
    int hour
    int minute

    HourMinute(int h, int m) {
        hour =  h
        minute = m
    }

    HourMinute plus(HourMinute hourMinute){
        this.hour=this.hour+hourMinute.hour
        this.minute=this.minute+hourMinute.minute
        return this
    }
}

def b1 = new HourMinute(4,5)
def b2 = new HourMinute(6,24)

def sumObj = (b1+b2)
assert sumObj.hour==10
assert  sumObj.minute==29

