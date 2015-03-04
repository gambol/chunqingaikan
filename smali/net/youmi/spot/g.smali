.class final Lnet/youmi/android/spot/g;
.super Lnet/youmi/android/c/a/v;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:I

.field final synthetic e:J

.field final synthetic f:Landroid/content/Context;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLandroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lnet/youmi/android/spot/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lnet/youmi/android/spot/g;->b:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/spot/g;->c:Ljava/lang/String;

    iput p4, p0, Lnet/youmi/android/spot/g;->d:I

    iput-wide p5, p0, Lnet/youmi/android/spot/g;->e:J

    iput-object p7, p0, Lnet/youmi/android/spot/g;->f:Landroid/content/Context;

    invoke-direct {p0}, Lnet/youmi/android/c/a/v;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    new-instance v0, Lnet/youmi/android/a/a/e/g/b;

    invoke-direct {v0}, Lnet/youmi/android/a/a/e/g/b;-><init>()V

    iget-object v1, p0, Lnet/youmi/android/spot/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/b;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/spot/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/b;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/spot/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/b;->c(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "entc="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lnet/youmi/android/spot/g;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lnet/youmi/android/spot/g;->e:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "&ct="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v4, p0, Lnet/youmi/android/spot/g;->e:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/e/g/b;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lnet/youmi/android/spot/g;->f:Landroid/content/Context;

    invoke-static {v1, v0}, Lnet/youmi/android/c/a/b;->a(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/b;)Ljava/lang/String;

    return-void
.end method
