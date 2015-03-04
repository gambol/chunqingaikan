.class public Lnet/youmi/android/onlineconfig/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/onlineconfig/d;->b:Landroid/content/Context;

    invoke-static {p3}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/d;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_1
    iput-object p2, p0, Lnet/youmi/android/onlineconfig/d;->a:Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;

    iput-object v0, p0, Lnet/youmi/android/onlineconfig/d;->c:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lnet/youmi/android/onlineconfig/d;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lnet/youmi/android/onlineconfig/d;)Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/onlineconfig/d;->a:Lnet/youmi/android/onlineconfig/OnlineConfigCallBack;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/onlineconfig/d;->b:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/onlineconfig/d;->c:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/onlineconfig/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v1

    new-instance v2, Lnet/youmi/android/onlineconfig/e;

    invoke-direct {v2, p0, v0}, Lnet/youmi/android/onlineconfig/e;-><init>(Lnet/youmi/android/onlineconfig/d;Ljava/lang/String;)V

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
