.class Lnet/youmi/android/onlineconfig/ntp/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lnet/youmi/android/onlineconfig/ntp/c;


# direct methods
.method constructor <init>(Lnet/youmi/android/onlineconfig/ntp/c;Z)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/onlineconfig/ntp/d;->b:Lnet/youmi/android/onlineconfig/ntp/c;

    iput-boolean p2, p0, Lnet/youmi/android/onlineconfig/ntp/d;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/d;->b:Lnet/youmi/android/onlineconfig/ntp/c;

    invoke-static {v0}, Lnet/youmi/android/onlineconfig/ntp/c;->a(Lnet/youmi/android/onlineconfig/ntp/c;)Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;

    move-result-object v0

    iget-boolean v1, p0, Lnet/youmi/android/onlineconfig/ntp/d;->a:Z

    invoke-interface {v0, v1}, Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;->onCheckNtpFinish(Z)V

    return-void
.end method
