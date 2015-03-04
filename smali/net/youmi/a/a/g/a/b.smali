.class public Lnet/youmi/android/a/a/g/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/a/g/a/b/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/a/b;->a:Landroid/content/Context;

    iput-object p1, p0, Lnet/youmi/android/a/a/g/a/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/a/b;->b:Lnet/youmi/android/a/a/g/a/b/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/a/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/b;->b:Lnet/youmi/android/a/a/g/a/b/b;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/a/c;->a(Lnet/youmi/android/a/a/g/a/b/b;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/b;->b:Lnet/youmi/android/a/a/g/a/b/b;

    invoke-virtual {v1}, Lnet/youmi/android/a/a/g/a/b/b;->g()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/a/b;->b:Lnet/youmi/android/a/a/g/a/b/b;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/a/c;->b(Lnet/youmi/android/a/a/g/a/b/b;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
