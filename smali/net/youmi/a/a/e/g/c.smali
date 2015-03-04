.class public Lnet/youmi/android/a/a/e/g/c;
.super Lnet/youmi/android/a/a/e/g/e;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Lnet/youmi/android/a/a/e/a/a/b;

.field private h:I

.field private i:Lnet/youmi/android/a/a/j/a;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lnet/youmi/android/a/a/e/g/e;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lnet/youmi/android/a/a/e/g/c;->a:I

    iput v1, p0, Lnet/youmi/android/a/a/e/g/c;->b:I

    const/16 v0, 0x11

    iput v0, p0, Lnet/youmi/android/a/a/e/g/c;->c:I

    iput v1, p0, Lnet/youmi/android/a/a/e/g/c;->e:I

    iput v1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    iput p1, p0, Lnet/youmi/android/a/a/e/g/c;->b:I

    iput p2, p0, Lnet/youmi/android/a/a/e/g/c;->a:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/c;->d:Ljava/lang/String;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/e/a/a/b;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/c;->g:Lnet/youmi/android/a/a/e/a/a/b;

    return-void
.end method

.method public a(Lnet/youmi/android/a/a/j/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/g/c;->i:Lnet/youmi/android/a/a/j/a;

    return-void
.end method

.method public a()Z
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    iget v1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    if-eq v1, v0, :cond_0

    iget v1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    iget v1, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/c;->e:I

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->f:I

    return v0
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/c;->h:I

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->a:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->b:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->c:I

    return v0
.end method

.method public h()Lnet/youmi/android/a/a/e/a/a/b;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/c;->g:Lnet/youmi/android/a/a/e/a/a/b;

    return-object v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/c;->h:I

    return v0
.end method

.method public j()Lnet/youmi/android/a/a/j/a;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/g/c;->i:Lnet/youmi/android/a/a/j/a;

    return-object v0
.end method
