.class public Lnet/youmi/android/a/b/g/e/a;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Z

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/io/File;

.field private j:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lnet/youmi/android/a/b/g/e/a;->d:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnet/youmi/android/a/b/g/e/a;->e:J

    if-nez p1, :cond_0

    iput-boolean v2, p0, Lnet/youmi/android/a/b/g/e/a;->d:Z

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    iput-boolean v2, p0, Lnet/youmi/android/a/b/g/e/a;->d:Z

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->a:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->a:Ljava/lang/String;

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->f:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->g:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/g/e/a;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/youmi/android/a/b/g/e/a;->d:Z

    goto :goto_0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lnet/youmi/android/a/b/g/e/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p4}, Lnet/youmi/android/a/b/g/e/a;->a(J)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lnet/youmi/android/a/b/g/e/a;->e:J

    return-void
.end method

.method public a(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/g/e/a;->i:Ljava/io/File;

    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->h:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/g/e/a;->j:Ljava/io/File;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-static {v0}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->f:Ljava/lang/String;

    iput-object v1, p0, Lnet/youmi/android/a/b/g/e/a;->g:Ljava/lang/String;

    iput-object v1, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/g/e/a;->c:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/b/g/e/a;->d:Z

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/b/g/e/a;->e:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e/a;->hashCode()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->i:Ljava/io/File;

    return-object v0
.end method

.method public h()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/e/a;->j:Ljava/io/File;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/b/g/e/a;->c:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
