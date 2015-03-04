package cn.sharesdk.framework.network; class h { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/network/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:I
a=0;// 
a=0;// .field public static b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/h;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v3, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     invoke-static {v0, v4}, Lcn/sharesdk/framework/utils/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     const/16 v4, 0x26
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/16 v4, 0x3d
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()Lorg/apache/http/client/HttpClient;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/k;);
a=0;//     invoke-direct {v1, v0}, Lcn/sharesdk/framework/network/k;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/k;);
a=0;//     sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget-object v2, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpVersion;);
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V
a=0;// 
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Lorg/apache/http/conn/scheme/SchemeRegistry;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/scheme/SchemeRegistry;);
a=0;//     new-instance v3, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v4, "http"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lorg/apache/http/conn/scheme/PlainSocketFactory;->getSocketFactory()Lorg/apache/http/conn/scheme/PlainSocketFactory;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/conn/scheme/PlainSocketFactory;);
a=0;//     const/16 v6, 0x50
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-direct {v3, v4, v5, v6}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     new-instance v3, Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     const-string v4, "https"
a=0;// 
a=0;//     const/16 v5, 0x1bb
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-direct {v3, v4, v1, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/scheme/Scheme;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     invoke-direct {v1, v0, v2}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;);
a=0;//     new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v2, v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/util/ArrayList;)Lorg/apache/http/client/methods/HttpPost;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)",
a=0;//             "Lorg/apache/http/client/methods/HttpPost;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/network/m;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/network/m;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/network/m;);
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/framework/network/h;->a(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/network/m;->c()Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/entity/InputStreamEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;)Lorg/apache/http/client/methods/HttpPost;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lorg/apache/http/client/methods/HttpPost;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/UUID;);
a=0;//     invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcn/sharesdk/framework/network/f;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/network/f;);
a=0;//     invoke-direct {v3}, Lcn/sharesdk/framework/network/f;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/network/f;);
a=0;//     new-instance v4, Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/network/m;);
a=0;//     invoke-direct {v4}, Lcn/sharesdk/framework/network/m;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/network/m;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_0
a=0;//     #v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     const-string v6, "--"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v2}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\r\n"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     const-string v6, "content-disposition: form-data; name=\""
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\"\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const-string v0, "Content-Type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "multipart/form-data; boundary="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v1, v0, v5}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "--"
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     const-string v0, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v6, p3, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\"; filename=\""
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "\"\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     invoke-static {}, Ljava/net/URLConnection;->getFileNameMap()Ljava/net/FileNameMap;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v5, v0}, Ljava/net/FileNameMap;->getContentTypeFor(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gtz v5, :cond_3
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "jpg"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "jepg"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, "image/jpeg"
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     const-string v5, "Content-Type: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcn/sharesdk/framework/network/f;->a(Lcn/sharesdk/framework/network/d;)Lcn/sharesdk/framework/network/f;
a=0;// 
a=0;//     new-instance v4, Lcn/sharesdk/framework/network/c;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/network/c;);
a=0;//     invoke-direct {v4}, Lcn/sharesdk/framework/network/c;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/network/c;);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcn/sharesdk/framework/network/f;->a(Lcn/sharesdk/framework/network/d;)Lcn/sharesdk/framework/network/f;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/m;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/network/m;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/m;);
a=0;//     const-string v4, "\r\n--"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v4, "--\r\n"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcn/sharesdk/framework/network/f;->a(Lcn/sharesdk/framework/network/d;)Lcn/sharesdk/framework/network/f;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/network/f;->c()Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "png"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     const-string v0, "image/png"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "gif"
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     const-string v0, "image/gif"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     new-instance v5, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v5}, Ljava/net/URLConnection;->guessContentTypeFromStream(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
a=0;// 
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-gtz v5, :cond_3
a=0;// 
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     const-string v0, "application/octet-stream"
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
a=0;//     .locals 11
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "downloading: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-static {p1, p3}, Lcn/sharesdk/framework/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p2}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "use time: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v3, v5, v3
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v1, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v1, p2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_d
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "Content-Disposition"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v5, v2}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     array-length v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_3
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget-object v2, v2, v6
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v2}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, ";"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     array-length v7, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v2, v7, :cond_3
a=0;// 
a=0;//     aget-object v8, v6, v2
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "filename"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     const-string v1, "="
a=0;// 
a=0;//     invoke-virtual {v8, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     aget-object v1, v1, v8
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v8, "\""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     const-string v8, "\""
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v8=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Conflicted);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Reference,Lorg/apache/http/HttpResponse;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     invoke-static {p2}, Lcn/sharesdk/framework/utils/a;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     invoke-interface {v5, v1}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_e
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     aget-object v1, v1, v6
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, "image/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     const-string v6, "image/"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v6, "."
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v6, "jpeg"
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     const-string v1, "jpg"
a=0;// 
a=0;//     :cond_4
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {p1, p3}, Lcn/sharesdk/framework/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/io/File;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v6, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/File;);
a=0;//     if-eqz p4, :cond_8
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "use time: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Reference,Ljava/lang/String;);v6=(Boolean);
a=0;//     const/16 v1, 0x2f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-lez v6, :cond_7
a=0;// 
a=0;//     add-int/lit8 v1, v6, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lez v6, :cond_e
a=0;// 
a=0;//     const/16 v6, 0x2e
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->lastIndexOf(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lez v6, :cond_e
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, v6
a=0;// 
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ge v7, v8, :cond_e
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v6=(Reference,Ljava/io/File;);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_9
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_a
a=0;//     :try_start_0
a=0;//     invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v5, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v1, 0x400
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v7, v1, [B
a=0;// 
a=0;//     #v7=(Reference,[B);
a=0;//     invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_b
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v5, v7, v8, v1}, Ljava/io/FileOutputStream;->write([BII)V
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_b
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "use time: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_c
a=0;//     throw v0
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Integer);v2=(PosShort);v5=(Reference,Lorg/apache/http/HttpResponse;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     invoke-interface {v5}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v3, "utf-8"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v3}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v4, "error"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "status"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v3}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_e
a=0;//     #v3=(LongLo);v4=(LongHi);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v7, Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v7}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v6, Lcn/sharesdk/framework/network/i;
a=0;// 
a=0;//     #v6=(UninitRef,Lcn/sharesdk/framework/network/i;);
a=0;//     invoke-direct {v6, p0, v7}, Lcn/sharesdk/framework/network/i;-><init>(Lcn/sharesdk/framework/network/h;Ljava/util/HashMap;)V
a=0;// 
a=0;//     #v6=(Reference,Lcn/sharesdk/framework/network/i;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/h;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/HttpResponseCallback;)V
a=0;// 
a=0;//     const-string v0, "resp"
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "httpGet: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v3, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/framework/network/h;->a(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "?"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v5, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5, v0}, Lorg/apache/http/client/methods/HttpGet;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->b:I
a=0;// 
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpGet;->setParams(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "use time: "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v1, v4, v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(LongLo);v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(PosShort);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/d;Lcn/sharesdk/framework/network/RawNetworkCallback;)V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/d;",
a=0;//             "Lcn/sharesdk/framework/network/RawNetworkCallback;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "raw post: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v3, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v5, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5, v0}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p3}, Lcn/sharesdk/framework/network/d;->c()Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-ne v4, v5, :cond_3
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "use time: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long v1, v5, v1
a=0;// 
a=0;//     invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v2, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p4, v1}, Lcn/sharesdk/framework/network/RawNetworkCallback;->onResponse(Ljava/io/InputStream;)V
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(LongLo);v2=(LongHi);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Integer);v5=(PosShort);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/HttpResponseCallback;)V
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;",
a=0;//             "Lcn/sharesdk/framework/network/HttpResponseCallback;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "httpPost: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;)Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v5, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v5, v0}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-direct {p0, p1, p2}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;)Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->b:I
a=0;// 
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPost;->setParams(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz p6, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {p6, v1}, Lcn/sharesdk/framework/network/HttpResponseCallback;->onResponse(Lorg/apache/http/HttpResponse;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "use time: "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v1, v4, v2
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(LongLo);v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "httpPut: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v3, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, p2}, Lcn/sharesdk/framework/network/h;->a(Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "?"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPut;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPut;);
a=0;//     invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPut;);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v5, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5, v0}, Lorg/apache/http/client/methods/HttpPut;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v4, Lcn/sharesdk/framework/network/c;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/network/c;);
a=0;//     invoke-direct {v4}, Lcn/sharesdk/framework/network/c;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/network/c;);
a=0;//     iget-object v0, p3, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/c;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v4}, Lcn/sharesdk/framework/network/c;->c()Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "application/octet-stream"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lorg/apache/http/entity/InputStreamEntity;->setContentEncoding(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->b:I
a=0;// 
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpPut;->setParams(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-eq v4, v5, :cond_2
a=0;// 
a=0;//     const/16 v5, 0xc9
a=0;// 
a=0;//     if-ne v4, v5, :cond_4
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "use time: "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v1, v4, v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v6, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(LongLo);v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(PosShort);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;//     .locals 9
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "jsonPost: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v3, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v3}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v4, Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/sharesdk/framework/network/m;);
a=0;//     invoke-direct {v4}, Lcn/sharesdk/framework/network/m;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Lcn/sharesdk/framework/network/m;);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     new-instance v5, Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v5}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Reference,Ljava/util/Iterator;);v7=(Conflicted);
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v7, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v5, v7, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v7=(Conflicted);
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v0, v5}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Lcn/sharesdk/framework/network/m;->a(Ljava/lang/String;)Lcn/sharesdk/framework/network/m;
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v4}, Lcn/sharesdk/framework/network/m;->c()Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, "application/json"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lorg/apache/http/entity/InputStreamEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/sharesdk/framework/network/e;
a=0;// 
a=0;//     iget-object v5, v0, Lcn/sharesdk/framework/network/e;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/network/e;->b:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v5, v0}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->a:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     sget v4, Lcn/sharesdk/framework/network/h;->b:I
a=0;// 
a=0;//     invoke-static {v0, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lorg/apache/http/client/methods/HttpPost;->setParams(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     const-string v0, "https://"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;->a()Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v4}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xc8
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-eq v4, v5, :cond_3
a=0;// 
a=0;//     const/16 v5, 0xc9
a=0;// 
a=0;//     if-ne v4, v5, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "utf-8"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "use time: "
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long v1, v4, v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v8, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(LongLo);v4=(Integer);v5=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v5=(PosShort);
a=0;//     invoke-interface {v3}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     const-string v2, "utf-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v3, "error"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v1, "status"
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     new-instance v1, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v1}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v1, v2}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// .end method
}}
