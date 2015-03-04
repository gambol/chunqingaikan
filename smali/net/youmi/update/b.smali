.class public Lnet/youmi/android/update/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/update/CheckAppUpdateCallBack;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/update/CheckAppUpdateCallBack;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/update/b;->b:Landroid/content/Context;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lnet/youmi/android/update/b;->b:Landroid/content/Context;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_1
    iput-object p2, p0, Lnet/youmi/android/update/b;->a:Lnet/youmi/android/update/CheckAppUpdateCallBack;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/update/b;)Lnet/youmi/android/update/CheckAppUpdateCallBack;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/update/b;->a:Lnet/youmi/android/update/CheckAppUpdateCallBack;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/update/b;->b:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/update/a;->a(Landroid/content/Context;)Lnet/youmi/android/update/AppUpdateInfo;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/update/c;

    invoke-direct {v2, p0, v0}, Lnet/youmi/android/update/c;-><init>(Lnet/youmi/android/update/b;Lnet/youmi/android/update/AppUpdateInfo;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
