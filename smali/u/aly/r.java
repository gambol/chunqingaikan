package u.aly; class r { void a() { int a;
a=0;// .class public Lu/aly/r;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetworkHelper.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final a:I = 0x1
a=0;// 
a=0;// .field public static final b:I = 0x2
a=0;// 
a=0;// .field public static final c:I = 0x3
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final d:I
a=0;// 
a=0;// .field private e:Ljava/lang/String;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:Landroid/content/Context;
a=0;// 
a=0;// .field private i:Lu/aly/w;
a=0;// 
a=0;// .field private j:Lu/aly/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lu/aly/r;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lu/aly/r;->d:I
a=0;// 
a=0;//     .line 60
a=0;//     const-string v0, "10.0.0.172"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lu/aly/r;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     const/16 v0, 0x50
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lu/aly/r;->g:I
a=0;// 
a=0;//     .line 68
a=0;//     iput-object p1, p0, Lu/aly/r;->h:Landroid/content/Context;
a=0;// 
a=0;//     .line 69
a=0;//     invoke-static {p1}, Lu/aly/h;->b(Landroid/content/Context;)Lu/aly/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/f;);
a=0;//     iput-object v0, p0, Lu/aly/r;->j:Lu/aly/f;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-direct {p0, p1}, Lu/aly/r;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lu/aly/r;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 197
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v0, "Android"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 198
a=0;//     const-string v0, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 199
a=0;//     const-string v0, "5.2.4"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 200
a=0;//     const-string v0, " "
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 203
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {p1}, Lu/aly/bi;->v(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 205
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 206
a=0;//     invoke-static {p1}, Lu/aly/bi;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 207
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 208
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 209
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 210
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 212
a=0;//     const-string v2, " "
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->getAppkey(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Lu/aly/bv;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 216
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 217
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lu/aly/r;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 105
a=0;//     const-string v3, "android.permission.ACCESS_NETWORK_STATE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lu/aly/r;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Integer);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lu/aly/r;->h:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v3, "connectivity"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 113
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, v2, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 116
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v3, "cmwap"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const-string v3, "3gwap"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const-string v3, "uniwap"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 117
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 121
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 123
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a([BLjava/lang/String;)[B
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v0, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 132
a=0;//     #v0=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v2, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 133
a=0;//     #v2=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     const/16 v3, 0x2710
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 134
a=0;//     const/16 v3, 0x7530
a=0;// 
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v3, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     .line 138
a=0;//     #v3=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     const-string v2, "X-Umeng-Sdk"
a=0;// 
a=0;//     iget-object v4, p0, Lu/aly/r;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 139
a=0;//     const-string v2, "Msg-Type"
a=0;// 
a=0;//     const-string v4, "envelope"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v4}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lu/aly/r;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     new-instance v2, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/HttpHost;);
a=0;//     iget-object v4, p0, Lu/aly/r;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget v5, p0, Lu/aly/r;->g:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v2, v4, v5}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 144
a=0;//     #v2=(Reference,Lorg/apache/http/HttpHost;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 145
a=0;//     const-string v5, "http.route.default-proxy"
a=0;// 
a=0;//     .line 144
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v5, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 149
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v2, Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     .line 150
a=0;//     #v2=(UninitRef,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     new-instance v4, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v4, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 151
a=0;//     #v4=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     .line 149
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-direct {v2, v4, v5, v6}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V
a=0;// 
a=0;//     .line 152
a=0;//     #v2=(Reference,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-virtual {v0, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     invoke-virtual {v2}, Lu/aly/w;->e()V
a=0;// 
a=0;//     .line 157
a=0;//     :cond_1
a=0;//     invoke-interface {v3, v0}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     invoke-virtual {v2}, Lu/aly/w;->f()V
a=0;// 
a=0;//     .line 161
a=0;//     :cond_2
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 163
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "MobclickAgent"
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "status code : "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v3, v2}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 164
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v2, v3, :cond_4
a=0;// 
a=0;//     .line 165
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Sent message to "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 170
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 173
a=0;//     :try_start_1
a=0;//     invoke-static {v2}, Lu/aly/bv;->b(Ljava/io/InputStream;)[B
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 175
a=0;//     :try_start_2
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 190
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 174
a=0;//     :catchall_0
a=0;//     #v2=(Reference,Ljava/io/InputStream;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(LongHi);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 175
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 176
a=0;//     throw v0
a=0;//     :try_end_2
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 184
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 185
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     .line 186
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "ClientProtocolException,Failed to send message."
a=0;// 
a=0;//     .line 185
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lorg/apache/http/HttpEntity;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(LongHi);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 179
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Lorg/apache/http/HttpResponse;);v2=(Integer);v3=(PosShort);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 181
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :catch_1
a=0;//     #v0=(Reference,Ljava/lang/Object;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 189
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "IOException,Failed to send message."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Lu/aly/bj;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 190
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b([B)I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 224
a=0;//     #v4=(One);
a=0;//     new-instance v1, Lu/aly/bb;
a=0;// 
a=0;//     #v1=(UninitRef,Lu/aly/bb;);
a=0;//     invoke-direct {v1}, Lu/aly/bb;-><init>()V
a=0;// 
a=0;//     .line 225
a=0;//     #v1=(Reference,Lu/aly/bb;);
a=0;//     new-instance v0, Lu/aly/cc;
a=0;// 
a=0;//     #v0=(UninitRef,Lu/aly/cc;);
a=0;//     new-instance v2, Lu/aly/cr$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lu/aly/cr$a;);
a=0;//     invoke-direct {v2}, Lu/aly/cr$a;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/cr$a;);
a=0;//     invoke-direct {v0, v2}, Lu/aly/cc;-><init>(Lu/aly/da;)V
a=0;// 
a=0;//     .line 228
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lu/aly/cc;);
a=0;//     invoke-virtual {v0, v1, p1}, Lu/aly/cc;->a(Lu/aly/bz;[B)V
a=0;// 
a=0;//     .line 230
a=0;//     iget v0, v1, Lu/aly/bb;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lu/aly/r;->j:Lu/aly/f;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/f;);
a=0;//     invoke-virtual {v1}, Lu/aly/bb;->j()Lu/aly/at;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lu/aly/f;->b(Lu/aly/at;)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lu/aly/r;->j:Lu/aly/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lu/aly/f;->c()V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "send log:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Lu/aly/bb;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lu/aly/bj;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v0, v1, Lu/aly/bb;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v4, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 243
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 236
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 237
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a([B)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 84
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,[B);v2=(Conflicted);
a=0;//     sget-object v2, Lcom/umeng/analytics/a;->f:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 97
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     sget-object v1, Lcom/umeng/analytics/a;->f:[Ljava/lang/String;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v1}, Lu/aly/r;->a([BLjava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 87
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     #v0=(Reference,Lu/aly/w;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     invoke-virtual {v0}, Lu/aly/w;->c()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     #v2=(Reference,Lu/aly/w;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     invoke-virtual {v2}, Lu/aly/w;->d()V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_3
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     invoke-direct {p0, v1}, Lu/aly/r;->b([B)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public a(Lu/aly/w;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     iput-object p1, p0, Lu/aly/r;->i:Lu/aly/w;
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
}}
