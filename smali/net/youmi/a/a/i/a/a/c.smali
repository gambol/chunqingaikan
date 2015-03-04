.class public Lnet/youmi/android/a/a/i/a/a/c;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lnet/youmi/android/a/a/i/a/b/f;

.field private e:Lnet/youmi/android/a/a/i/a/b/d;

.field private f:Lnet/youmi/android/a/a/e/a/b/h;

.field private g:Lnet/youmi/android/a/a/e/a/b/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->a:I

    return-void
.end method


# virtual methods
.method public a()Lnet/youmi/android/a/a/e/a/b/h;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->f:Lnet/youmi/android/a/a/e/a/b/h;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->a:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->b:Ljava/lang/String;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/a/b/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->g:Lnet/youmi/android/a/a/e/a/b/f;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/a/b/h;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->f:Lnet/youmi/android/a/a/e/a/b/h;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/i/a/b/d;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->e:Lnet/youmi/android/a/a/i/a/b/d;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/i/a/b/f;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->d:Lnet/youmi/android/a/a/i/a/b/f;

    return-void
.end method

.method public b()Lnet/youmi/android/a/a/e/a/b/f;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->g:Lnet/youmi/android/a/a/e/a/b/f;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/i/a/a/c;->c:Ljava/lang/String;

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->a:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lnet/youmi/android/a/a/i/a/b/d;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->e:Lnet/youmi/android/a/a/i/a/b/d;

    return-object v0
.end method

.method public g()Lnet/youmi/android/a/a/i/a/b/f;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/i/a/a/c;->d:Lnet/youmi/android/a/a/i/a/b/f;

    return-object v0
.end method

.method public h()Landroid/app/Activity;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/c;->f:Lnet/youmi/android/a/a/e/a/b/h;

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lnet/youmi/android/a/a/i/a/a/c;->f:Lnet/youmi/android/a/a/e/a/b/h;

    invoke-interface {v1}, Lnet/youmi/android/a/a/e/a/b/h;->g()Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
