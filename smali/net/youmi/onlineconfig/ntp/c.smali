.class public Lnet/youmi/android/onlineconfig/ntp/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;


# direct methods
.method public constructor <init>(IIILnet/youmi/android/onlineconfig/ntp/NtpResultListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lnet/youmi/android/onlineconfig/ntp/c;->a:I

    iput p2, p0, Lnet/youmi/android/onlineconfig/ntp/c;->b:I

    iput p3, p0, Lnet/youmi/android/onlineconfig/ntp/c;->c:I

    iput-object p4, p0, Lnet/youmi/android/onlineconfig/ntp/c;->d:Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/onlineconfig/ntp/c;)Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/ntp/c;->d:Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    new-instance v0, Lnet/youmi/android/onlineconfig/ntp/a;

    iget v1, p0, Lnet/youmi/android/onlineconfig/ntp/c;->a:I

    iget v2, p0, Lnet/youmi/android/onlineconfig/ntp/c;->b:I

    iget v3, p0, Lnet/youmi/android/onlineconfig/ntp/c;->c:I

    invoke-direct {v0, v1, v2, v3}, Lnet/youmi/android/onlineconfig/ntp/a;-><init>(III)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Lnet/youmi/android/onlineconfig/ntp/a;->a()Z

    move-result v0

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/ntp/c;->d:Lnet/youmi/android/onlineconfig/ntp/NtpResultListener;

    if-eqz v1, :cond_0

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/onlineconfig/ntp/d;

    invoke-direct {v2, p0, v0}, Lnet/youmi/android/onlineconfig/ntp/d;-><init>(Lnet/youmi/android/onlineconfig/ntp/c;Z)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
