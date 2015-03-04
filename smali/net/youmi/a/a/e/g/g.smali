.class public Lnet/youmi/android/a/a/e/g/g;
.super Lnet/youmi/android/a/a/e/g/c;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:D

.field private f:D

.field private g:Z


# direct methods
.method public constructor <init>(II)V
    .locals 4

    const/16 v1, -0x270f

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/a/e/g/c;-><init>(II)V

    iput v1, p0, Lnet/youmi/android/a/a/e/g/g;->a:I

    iput v1, p0, Lnet/youmi/android/a/a/e/g/g;->b:I

    iput v0, p0, Lnet/youmi/android/a/a/e/g/g;->c:I

    iput v0, p0, Lnet/youmi/android/a/a/e/g/g;->d:I

    iput-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    iput-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    iput-boolean v0, p0, Lnet/youmi/android/a/a/e/g/g;->g:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)I
    .locals 6

    const-wide/16 v4, 0x0

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    cmpl-double v1, v2, v4

    if-lez v1, :cond_0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    cmpl-double v1, v2, v4

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v0

    int-to-double v0, v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    mul-double/2addr v0, v2

    double-to-int v0, v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v0

    if-le v1, v0, :cond_1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->d:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->c:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(D)V
    .locals 5

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/16 v2, 0x0

    cmpg-double v4, p1, v2

    if-gez v4, :cond_1

    :goto_0
    cmpl-double v4, v2, v0

    if-lez v4, :cond_0

    :goto_1
    iput-wide v0, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    return-void

    :cond_0
    move-wide v0, v2

    goto :goto_1

    :cond_1
    move-wide v2, p1

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lnet/youmi/android/a/a/e/g/g;->g:Z

    return-void
.end method

.method public b(Landroid/content/Context;)I
    .locals 6

    const-wide/16 v4, 0x0

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    cmpl-double v1, v2, v4

    if-lez v1, :cond_0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    cmpl-double v1, v2, v4

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v0

    int-to-double v0, v0

    iget-wide v2, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    mul-double/2addr v0, v2

    double-to-int v0, v0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->b()I

    move-result v1

    invoke-virtual {v0}, Lnet/youmi/android/a/b/k/f;->c()I

    move-result v0

    if-le v1, v0, :cond_1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->c:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->d:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(D)V
    .locals 5

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const-wide/16 v2, 0x0

    cmpg-double v4, p1, v2

    if-gez v4, :cond_1

    :goto_0
    cmpl-double v4, v2, v0

    if-lez v4, :cond_0

    :goto_1
    iput-wide v0, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    return-void

    :cond_0
    move-wide v0, v2

    goto :goto_1

    :cond_1
    move-wide v2, p1

    goto :goto_0
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/g;->a:I

    return-void
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/g;->b:I

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/g;->c:I

    return-void
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/a/e/g/g;->d:I

    return-void
.end method

.method public s()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->a:I

    return v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->b:I

    return v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->c:I

    return v0
.end method

.method public v()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/a/e/g/g;->d:I

    return v0
.end method

.method public w()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/e/g/g;->g:Z

    return v0
.end method

.method public x()D
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/e/g/g;->e:D

    return-wide v0
.end method

.method public y()D
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/e/g/g;->f:D

    return-wide v0
.end method
