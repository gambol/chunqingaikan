.class Lnet/youmi/android/onlineconfig/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lnet/youmi/android/onlineconfig/d;


# direct methods
.method constructor <init>(Lnet/youmi/android/onlineconfig/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/onlineconfig/e;->b:Lnet/youmi/android/onlineconfig/d;

    iput-object p2, p0, Lnet/youmi/android/onlineconfig/e;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/onlineconfig/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/e;->b:Lnet/youmi/android/onlineconfig/d;

    invoke-static {v0}, Lnet/youmi/android/onlineconfig/d;->b(Lnet/youmi/android/onlineconfig/d;)Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/e;->b:Lnet/youmi/android/onlineconfig/d;

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/d;->a(Lnet/youmi/android/onlineconfig/d;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/onlineconfig/e;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;->onGetOnlineConfigSuccessful(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/onlineconfig/e;->b:Lnet/youmi/android/onlineconfig/d;

    invoke-static {v0}, Lnet/youmi/android/onlineconfig/d;->b(Lnet/youmi/android/onlineconfig/d;)Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/e;->b:Lnet/youmi/android/onlineconfig/d;

    invoke-static {v1}, Lnet/youmi/android/onlineconfig/d;->a(Lnet/youmi/android/onlineconfig/d;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;->onGetOnlineConfigFailed(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
