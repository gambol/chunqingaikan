.class Lnet/youmi/android/a/a/g/g/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/a/g/g/d;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/g/g/d;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/g/g/e;->a:Lnet/youmi/android/a/a/g/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->c()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->d()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v1}, Lnet/youmi/android/a/a/g/g/d;->a(Ljava/util/List;)Ljava/util/List;

    :cond_2
    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->e()Ljava/util/Timer;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    invoke-static {v1}, Lnet/youmi/android/a/a/g/g/d;->a(Ljava/util/Timer;)Ljava/util/Timer;

    :cond_3
    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_1
    if-ge v1, v2, :cond_0

    new-instance v3, Lnet/youmi/android/a/a/j/c/b;

    iget-object v0, p0, Lnet/youmi/android/a/a/g/g/e;->a:Lnet/youmi/android/a/a/g/g/d;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/g/d;->a(Lnet/youmi/android/a/a/g/g/d;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0}, Lnet/youmi/android/a/a/j/c/b;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/g/c;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/g/c;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Lnet/youmi/android/a/a/j/c/b;->b(Ljava/lang/String;I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lnet/youmi/android/a/a/g/g/f;

    invoke-direct {v0, p0}, Lnet/youmi/android/a/a/g/g/f;-><init>(Lnet/youmi/android/a/a/g/g/e;)V

    invoke-static {}, Lnet/youmi/android/a/a/g/g/d;->e()Ljava/util/Timer;

    move-result-object v3

    add-int/lit8 v4, v1, 0x1

    mul-int/lit16 v4, v4, 0xdac

    int-to-long v4, v4

    invoke-virtual {v3, v0, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method
