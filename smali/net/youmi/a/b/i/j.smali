.class final Lnet/youmi/android/a/b/i/j;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/http/client/RedirectHandler;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/i/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/i/e;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/i/j;->a:Lnet/youmi/android/a/b/i/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLocationURI(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "location"

    invoke-interface {p1, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/i/j;->a:Lnet/youmi/android/a/b/i/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/a/b/i/j;->a:Lnet/youmi/android/a/b/i/e;

    invoke-interface {v0, v1}, Lnet/youmi/android/a/b/i/e;->a(Ljava/lang/String;)V

    :cond_2
    invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    goto :goto_0
.end method

.method public isRedirectRequested(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Z
    .locals 2

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v0

    const/16 v1, 0x12d

    if-eq v0, v1, :cond_0

    const/16 v1, 0x12e

    if-eq v0, v1, :cond_0

    const/16 v1, 0x12f

    if-eq v0, v1, :cond_0

    const/16 v1, 0x133

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
