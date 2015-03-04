package safiap.framework.sdk.a; class a { void a() { int a;
a=0;// .class public Lsafiap/framework/sdk/a/a;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/String;",
a=0;//         "Ljava/lang/Integer;",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final c:Ljava/lang/String; = "ApkDownloadTask"
a=0;// 
a=0;// .field private static final d:Ljava/lang/String; = "X-SAF-UID"
a=0;// 
a=0;// .field private static final e:Ljava/lang/String; = "X-SAF-MAC"
a=0;// 
a=0;// .field private static final f:Ljava/lang/String; = "X-SAF-IMEI"
a=0;// 
a=0;// .field private static final g:Ljava/lang/String; = "X-SAF-IMSI"
a=0;// 
a=0;// .field private static final h:Ljava/lang/String; = "X-SAF-Action"
a=0;// 
a=0;// .field private static final i:Ljava/lang/String; = "X-SAF-Version"
a=0;// 
a=0;// .field private static final j:Ljava/lang/String; = "X-SAF-System"
a=0;// 
a=0;// .field private static final k:Ljava/lang/String; = "X-SAF-Phone"
a=0;// 
a=0;// .field private static final l:I = 0x2000
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Ljava/lang/String;
a=0;// 
a=0;// .field private m:Landroid/content/Context;
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// .field private o:Ljava/lang/String;
a=0;// 
a=0;// .field private p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;// .field private q:Z
a=0;// 
a=0;// .field private r:Z
a=0;// 
a=0;// .field private s:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const-string v0, "ApkDownloadTask"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IZLjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     .line 59
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     .line 63
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lsafiap/framework/sdk/a/a;->s:J
a=0;// 
a=0;//     .line 73
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 74
a=0;//     iput-object p2, p0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     if-gez p3, :cond_2
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lsafiap/framework/sdk/a/a;->n:I
a=0;// 
a=0;//     .line 84
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     iput-boolean p4, p0, Lsafiap/framework/sdk/a/a;->q:Z
a=0;// 
a=0;//     .line 85
a=0;//     iput-object p5, p0, Lsafiap/framework/sdk/a/a;->o:Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 87
a=0;//     iput-object p1, p0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     .line 88
a=0;//     new-instance v0, Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/sdk/b/c;);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lsafiap/framework/sdk/b/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/b/c;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 76
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(LongHi);
a=0;//     const-string v0, "Saf.Default.Action"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 81
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iput p3, p0, Lsafiap/framework/sdk/a/a;->n:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x2000
a=0;// 
a=0;//     .line 296
a=0;//     #v2=(PosShort);
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     sget-object v0, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "Context is null! Use default cache size."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public varargs a([Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 20
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 282
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "ApkDownloadTask.doInBackgroud().Task:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ".url:"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aget-object v4, p1, v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v2, v0, Lsafiap/framework/sdk/a/a;->q:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v2, v0, Lsafiap/framework/sdk/a/a;->r:Z
a=0;// 
a=0;//     .line 102
a=0;//     const-string v2, "patch"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lsafiap/framework/sdk/a/a;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 103
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lsafiap/framework/sdk/b/d;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object v4, v2
a=0;// 
a=0;//     .line 107
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "target file: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 109
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_2
a=0;//     #v5=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 112
a=0;//     :cond_4
a=0;//     #v2=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v3, v0, Lsafiap/framework/sdk/a/a;->q:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v4, v3}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 113
a=0;//     #v10=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v10}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v10}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 117
a=0;//     :cond_5
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 118
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "temp file: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v3, v0, Lsafiap/framework/sdk/a/a;->q:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v2, v5, v3}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 120
a=0;//     #v11=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v11}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v11}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     .line 124
a=0;//     :cond_6
a=0;//     new-instance v12, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v12=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v12}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 125
a=0;//     #v12=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     const/16 v3, 0x4e20
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x4e20
a=0;// 
a=0;//     invoke-static {v2, v3}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v13, Lorg/apache/http/protocol/BasicHttpContext;
a=0;// 
a=0;//     #v13=(UninitRef,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     invoke-direct {v13}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V
a=0;// 
a=0;//     .line 130
a=0;//     #v13=(Reference,Lorg/apache/http/protocol/BasicHttpContext;);
a=0;//     new-instance v14, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v14=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, p1, v2
a=0;// 
a=0;//     invoke-direct {v14, v2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 132
a=0;//     #v14=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/sdk/b/c;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/sdk/b/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 133
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     if-ne v2, v3, :cond_8
a=0;// 
a=0;//     .line 134
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     const-string v2, "Saf-Uid-Unknown"
a=0;// 
a=0;//     .line 136
a=0;//     :cond_8
a=0;//     const-string v3, "X-SAF-UID"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 138
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/sdk/b/c;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 139
a=0;//     if-eqz v2, :cond_9
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v2, v3, :cond_a
a=0;// 
a=0;//     .line 140
a=0;//     :cond_9
a=0;//     const-string v2, "Android-Saf-MAC"
a=0;// 
a=0;//     .line 142
a=0;//     :cond_a
a=0;//     const-string v3, "X-SAF-MAC"
a=0;// 
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/sdk/b/c;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 145
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v2, v3, :cond_c
a=0;// 
a=0;//     .line 146
a=0;//     :cond_b
a=0;//     const-string v2, "Android-Saf-IMEI"
a=0;// 
a=0;//     .line 148
a=0;//     :cond_c
a=0;//     const-string v3, "X-SAF-IMEI"
a=0;// 
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/sdk/b/c;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 151
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v2, v3, :cond_e
a=0;// 
a=0;//     .line 152
a=0;//     :cond_d
a=0;//     const-string v2, "Android-Saf-IMSI"
a=0;// 
a=0;//     .line 154
a=0;//     :cond_e
a=0;//     const-string v3, "X-SAF-IMSI"
a=0;// 
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 157
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     if-ne v2, v3, :cond_14
a=0;// 
a=0;//     .line 158
a=0;//     :cond_f
a=0;//     const-string v2, "Android:0"
a=0;// 
a=0;//     .line 162
a=0;//     :goto_3
a=0;//     const-string v3, "X-SAF-System"
a=0;// 
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->e()Ljava/lang/String;
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
a=0;//     .line 165
a=0;//     const-string v3, " "
a=0;// 
a=0;//     if-eq v2, v3, :cond_10
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     invoke-static {}, Lsafiap/framework/sdk/b/c;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_11
a=0;// 
a=0;//     .line 166
a=0;//     :cond_10
a=0;//     const-string v2, "Android-Saf-Phone"
a=0;// 
a=0;//     .line 168
a=0;//     :cond_11
a=0;//     const-string v3, "X-SAF-Phone"
a=0;// 
a=0;//     invoke-virtual {v14, v3, v2}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     const-string v2, "X-SAF-Action"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v14, v2, v3}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v2, "X-SAF-Version"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Lsafiap/framework/sdk/a/a;->n:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v14, v2, v3}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 173
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "uid: "
a=0;// 
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lsafiap/framework/sdk/a/a;->p:Lsafiap/framework/sdk/b/c;
a=0;// 
a=0;//     invoke-virtual {v6}, Lsafiap/framework/sdk/b/c;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, ", package: "
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v6, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, " version: "
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Lsafiap/framework/sdk/a/a;->n:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     cmp-long v2, v2, v6
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_12
a=0;// 
a=0;//     .line 175
a=0;//     const-string v2, "Range"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "bytes="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     #v6=(LongLo);
a=0;//     invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "-"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v14, v2, v3}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_12
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move v9, v2
a=0;// 
a=0;//     .line 181
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     if-lez v9, :cond_25
a=0;// 
a=0;//     .line 182
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "retry id: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     rsub-int/lit8 v6, v9, 0x5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     :try_start_0
a=0;//     invoke-interface {v12, v14, v13}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 186
a=0;//     #v6=(Reference,Lorg/apache/http/HttpResponse;);
a=0;//     const-string v2, "http.target_host"
a=0;// 
a=0;//     invoke-interface {v13, v2}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Lorg/apache/http/HttpHost;
a=0;// 
a=0;//     .line 187
a=0;//     const-string v3, "http.request"
a=0;// 
a=0;//     invoke-interface {v13, v3}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     .line 188
a=0;//     sget-object v7, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v7=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Catch targetHost: "
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v7, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Catch realRequest: "
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/client/methods/HttpUriRequest;->getURI()Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 191
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 192
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 193
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getReasonPhrase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 194
a=0;//     sget-object v7, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v15, "Catch Task: "
a=0;// 
a=0;//     invoke-direct {v8, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     iget-object v15, v0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v15, " get respond code: "
a=0;// 
a=0;//     invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v15, " get reason: "
a=0;// 
a=0;//     invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v7, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v3, v2, :cond_15
a=0;// 
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     if-eq v3, v2, :cond_15
a=0;// 
a=0;//     .line 196
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Download failed, response code: "
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     const/16 v2, 0x1a0
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v3, v2, :cond_13
a=0;// 
a=0;//     .line 198
a=0;//     invoke-virtual {v11}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     .line 200
a=0;//     :cond_13
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :cond_14
a=0;//     #v1=(Uninit);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v7=(Uninit);v8=(Uninit);v9=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Android:"
a=0;// 
a=0;//     invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 203
a=0;//     :cond_15
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(PosShort);v3=(Integer);v7=(Reference,Lsafiap/framework/util/MyLogger;);v8=(Reference,Ljava/lang/StringBuilder;);v9=(Integer);v15=(Reference,Ljava/lang/String;);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 204
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v2, :cond_23
a=0;// 
a=0;//     .line 205
a=0;//     sget-object v3, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v6, "entity is not null"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 206
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 207
a=0;//     #v6=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 211
a=0;//     :try_start_2
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 212
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     add-long/2addr v15, v7
a=0;// 
a=0;//     .line 213
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "filename="
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, " filelength="
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-wide v0, v15
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 214
a=0;//     const-wide/16 v7, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     iget-boolean v2, v0, Lsafiap/framework/sdk/a/a;->r:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_17
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v2, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     new-instance v17, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v11, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);v17=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 221
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Reference,Ujava/lang/Object;);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     if-nez v2, :cond_16
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v17, "Context is null! Use default cache size."
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 222
a=0;//     :cond_16
a=0;//     #v17=(Conflicted);
a=0;//     const/16 v2, 0x2000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     new-array v0, v2, [B
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     .line 223
a=0;//     #v17=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Integer);
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v2, v0, :cond_18
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Lsafiap/framework/sdk/a/a;->isCancelled()Z
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     if-nez v18, :cond_18
a=0;// 
a=0;//     .line 224
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v3, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 225
a=0;//     int-to-long v0, v2
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v18, v0
a=0;// 
a=0;//     #v18=(LongLo);v19=(LongHi);
a=0;//     add-long v7, v7, v18
a=0;// 
a=0;//     .line 226
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Integer;);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     long-to-int v0, v7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v19, v2, v18
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     long-to-int v0, v15
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v19, v2, v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/sdk/a/a;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 223
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 219
a=0;//     :cond_17
a=0;//     #v2=(Boolean);v3=(Null);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const v17, 0x8001
a=0;// 
a=0;//     #v17=(Char);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-virtual {v2, v5, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 228
a=0;//     :cond_18
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Integer);v17=(Reference,[B);v18=(Byte);
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 234
a=0;//     if-eqz v3, :cond_19
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_3
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_19
a=0;//     if-eqz v6, :cond_1a
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_1a
a=0;//     invoke-virtual/range {p0 .. p0}, Lsafiap/framework/sdk/a/a;->isCancelled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1f
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Integer;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     long-to-int v6, v15
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     long-to-int v6, v15
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/sdk/a/a;->publishProgress([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 248
a=0;//     :goto_7
a=0;//     invoke-virtual {v11}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, v2, v15
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_22
a=0;// 
a=0;//     .line 250
a=0;//     invoke-virtual {v11, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 251
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v11}, Ljava/io/File;->delete()Z
a=0;//     :try_end_3
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 252
a=0;//     if-eqz v2, :cond_21
a=0;// 
a=0;//     .line 278
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 229
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v7=(Conflicted);v8=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 230
a=0;//     :try_start_4
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v7, "ApkDownloadTask"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, "SAF-A Exception:500001"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 232
a=0;//     if-eqz v3, :cond_1b
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_5
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1b
a=0;//     if-eqz v6, :cond_1c
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_5 .. :try_end_5} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_1
a=0;// 
a=0;//     .line 278
a=0;//     :cond_1c
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v3, :cond_1d
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_6
a=0;//     invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1d
a=0;//     if-eqz v6, :cond_1e
a=0;// 
a=0;//     .line 238
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_1e
a=0;//     throw v2
a=0;//     :try_end_6
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_6 .. :try_end_6} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
a=0;//     .catchall {:try_start_6 .. :try_end_6} :catchall_1
a=0;// 
a=0;//     .line 264
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 265
a=0;//     :try_start_7
a=0;//     #v2=(Reference,Lorg/apache/http/client/ClientProtocolException;);
a=0;//     const-string v3, "ApkDownloadTask"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "SAF-A Exception:500002"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 266
a=0;//     invoke-virtual {v2}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
a=0;//     :try_end_7
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_1
a=0;// 
a=0;//     .line 267
a=0;//     add-int/lit8 v2, v9, -0x1
a=0;// 
a=0;//     .line 278
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     .line 279
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 245
a=0;//     :cond_1f
a=0;//     #v0=(Byte);v2=(Boolean);v7=(LongLo);v8=(LongHi);v15=(LongLo);v16=(LongHi);v17=(Reference,[B);v18=(Byte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :try_start_8
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/Integer;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Integer;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     long-to-int v6, v15
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/sdk/a/a;->publishProgress([Ljava/lang/Object;)V
a=0;//     :try_end_8
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_8 .. :try_end_8} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
a=0;//     .catchall {:try_start_8 .. :try_end_8} :catchall_1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 268
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 269
a=0;//     :try_start_9
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     const-string v3, "ApkDownloadTask"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "SAF-A Exception:500003"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 271
a=0;//     instance-of v3, v2, Ljava/net/SocketTimeoutException;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_20
a=0;// 
a=0;//     instance-of v3, v2, Lorg/apache/http/conn/ConnectTimeoutException;
a=0;// 
a=0;//     if-nez v3, :cond_20
a=0;// 
a=0;//     instance-of v3, v2, Lorg/apache/http/NoHttpResponseException;
a=0;// 
a=0;//     if-nez v3, :cond_20
a=0;// 
a=0;//     instance-of v2, v2, Ljava/net/SocketException;
a=0;//     :try_end_9
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_1
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_24
a=0;// 
a=0;//     .line 273
a=0;//     :cond_20
a=0;//     #v2=(Conflicted);
a=0;//     add-int/lit8 v2, v9, -0x1
a=0;// 
a=0;//     .line 278
a=0;//     :goto_8
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     move v9, v2
a=0;// 
a=0;//     .line 279
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 255
a=0;//     :cond_21
a=0;//     :try_start_a
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/a/a;);v2=(Boolean);v3=(LongHi);v7=(LongLo);v8=(LongHi);v15=(LongLo);v16=(LongHi);v17=(Reference,[B);v18=(Byte);
a=0;//     sget-object v2, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v3, "Apk cannot be saved! Check for permission."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;//     :try_end_a
a=0;//     .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_a .. :try_end_a} :catch_1
a=0;//     .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
a=0;//     .catchall {:try_start_a .. :try_end_a} :catchall_1
a=0;// 
a=0;//     .line 256
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_22
a=0;//     #v2=(Byte);v3=(LongHi);v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :cond_23
a=0;//     #v3=(Integer);v7=(Reference,Lsafiap/framework/util/MyLogger;);v8=(Reference,Ljava/lang/StringBuilder;);v15=(Reference,Ljava/lang/String;);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     :cond_24
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);v15=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 278
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/conn/ClientConnectionManager;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 282
a=0;//     :cond_25
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/sdk/a/a;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCancelled()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     sget-object v0, Lsafiap/framework/sdk/a/a;->b:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Task: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is cancelled."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     iget-object v0, p0, Lsafiap/framework/sdk/a/a;->m:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lsafiap/framework/sdk/a/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/sdk/a/a;->r:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 292
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0}, Landroid/os/AsyncTask;->onCancelled()V
a=0;// 
a=0;//     .line 293
a=0;//     return-void
a=0;// .end method
}}
