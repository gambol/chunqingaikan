.class public Lnet/youmi/android/a/b/i/a/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lnet/youmi/android/a/b/i/a/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lnet/youmi/android/a/b/i/a/b;->c:I

    if-nez v0, :cond_0

    const/16 v0, 0x64

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lnet/youmi/android/a/b/i/a/b;->c:I

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lnet/youmi/android/a/b/i/a/b;->c:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/a/b;->a:Ljava/lang/String;

    return-void
.end method

.method b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/b;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "not set"

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/b;->a:Ljava/lang/String;

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/a/b;->b:Ljava/lang/String;

    return-void
.end method

.method c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/b;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "not set"

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/i/a/b;->b:Ljava/lang/String;

    goto :goto_0
.end method
