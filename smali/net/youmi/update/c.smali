.class Lnet/youmi/android/update/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/update/AppUpdateInfo;

.field final synthetic b:Lnet/youmi/android/update/b;


# direct methods
.method constructor <init>(Lnet/youmi/android/update/b;Lnet/youmi/android/update/AppUpdateInfo;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/update/c;->b:Lnet/youmi/android/update/b;

    iput-object p2, p0, Lnet/youmi/android/update/c;->a:Lnet/youmi/android/update/AppUpdateInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/update/c;->b:Lnet/youmi/android/update/b;

    invoke-static {v0}, Lnet/youmi/android/update/b;->a(Lnet/youmi/android/update/b;)Lnet/youmi/android/update/CheckAppUpdateCallBack;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/update/c;->a:Lnet/youmi/android/update/AppUpdateInfo;

    invoke-interface {v0, v1}, Lnet/youmi/android/update/CheckAppUpdateCallBack;->onCheckAppUpdateFinish(Lnet/youmi/android/update/AppUpdateInfo;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
