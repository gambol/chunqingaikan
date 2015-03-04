.class Lnet/youmi/android/a/b/i/d;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/http/Header;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/i/c;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/i/c;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/d;->a:Lnet/youmi/android/a/b/i/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getElements()[Lorg/apache/http/HeaderElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "host"

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/i/d;->a:Lnet/youmi/android/a/b/i/c;

    iget-object v0, v0, Lnet/youmi/android/a/b/i/c;->g:Ljava/lang/String;

    return-object v0
.end method
