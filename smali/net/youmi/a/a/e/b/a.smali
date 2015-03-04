.class public Lnet/youmi/android/a/a/e/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/b/c/d;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lnet/youmi/android/a/a/e/b/a;->d:Z

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lnet/youmi/android/a/a/e/b/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/b/a;->a:Ljava/lang/String;

    if-nez v1, :cond_0

    :goto_0
    iput-boolean v0, p0, Lnet/youmi/android/a/a/e/b/a;->d:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iput-wide p1, p0, Lnet/youmi/android/a/a/e/b/a;->c:J

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnet/youmi/android/a/a/e/b/a;->d:Z

    return v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lnet/youmi/android/a/a/e/b/a;->a:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/b/a;->b:Ljava/lang/String;

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/b/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/b/a;->b:Ljava/lang/String;

    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/b/a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public m()J
    .locals 2

    iget-wide v0, p0, Lnet/youmi/android/a/a/e/b/a;->c:J

    return-wide v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/a/e/b/a;->a:Ljava/lang/String;

    return-object v0
.end method
