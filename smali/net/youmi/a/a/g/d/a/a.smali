.class Lnet/youmi/android/a/a/g/d/a/a;
.super Ljava/lang/Object;


# static fields
.field private static c:Lnet/youmi/android/a/a/g/d/a/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/Queue;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Context must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lnet/youmi/android/a/a/g/d/a/a;->a:Landroid/content/Context;

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    return-void
.end method

.method static a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/d/a/a;
    .locals 1

    sget-object v0, Lnet/youmi/android/a/a/g/d/a/a;->c:Lnet/youmi/android/a/a/g/d/a/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/a/g/d/a/a;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/d/a/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lnet/youmi/android/a/a/g/d/a/a;->c:Lnet/youmi/android/a/a/g/d/a/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/a/a/g/d/a/a;->c:Lnet/youmi/android/a/a/g/d/a/a;

    return-object v0
.end method


# virtual methods
.method a()Lnet/youmi/android/a/a/g/d/a/d;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/d/a/d;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lnet/youmi/android/a/a/g/d/a/d;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method b()Lnet/youmi/android/a/a/g/d/a/d;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/d/a/d;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method d()Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/d/a/a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
