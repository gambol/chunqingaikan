package cn.dm.a; class f { void a() { int a;
a=0;// .class public Lcn/dm/a/f;
a=0;// .super Ljava/lang/Thread;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcn/dm/android/f/e; = null
a=0;// 
a=0;// .field private static final e:I = 0x2800
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Z
a=0;// 
a=0;// .field public b:Z
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Ljava/io/File;
a=0;// 
a=0;// .field private g:J
a=0;// 
a=0;// .field private h:J
a=0;// 
a=0;// .field private i:J
a=0;// 
a=0;// .field private j:J
a=0;// 
a=0;// .field private final k:I
a=0;// 
a=0;// .field private final l:I
a=0;// 
a=0;// .field private final m:I
a=0;// 
a=0;// .field private n:Lcn/dm/a/c/b;
a=0;// 
a=0;// .field private o:Lcn/dm/a/a/a;
a=0;// 
a=0;// .field private p:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/a/f;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Ljava/io/File;JJLcn/dm/a/c/b;Lcn/dm/a/a/a;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcn/dm/a/f;);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     .line 33
a=0;//     const v0, 0x9c40
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iput v0, p0, Lcn/dm/a/f;->k:I
a=0;// 
a=0;//     .line 34
a=0;//     const v0, 0xea60
a=0;// 
a=0;//     iput v0, p0, Lcn/dm/a/f;->l:I
a=0;// 
a=0;//     .line 36
a=0;//     const/16 v0, 0x3e8
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lcn/dm/a/f;->m:I
a=0;// 
a=0;//     .line 43
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/dm/a/f;->p:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcn/dm/a/f;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p7, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     .line 52
a=0;//     iput-object p8, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     .line 53
a=0;//     iput-object p2, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     .line 54
a=0;//     iput-wide p3, p0, Lcn/dm/a/f;->g:J
a=0;// 
a=0;//     .line 55
a=0;//     iput-wide p3, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     .line 56
a=0;//     iput-wide p5, p0, Lcn/dm/a/f;->h:J
a=0;// 
a=0;//     .line 57
a=0;//     iput-wide p3, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     .line 58
a=0;//     invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/a/f;->p:Ljava/lang/String;
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/io/File;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Lcn/dm/a/d/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget-object v3, Lcn/dm/a/d/a;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 186
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 187
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {p1, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x2800
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     const-wide/16 v6, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     .line 65
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     new-array v4, v0, [B
a=0;// 
a=0;//     .line 68
a=0;//     :try_start_0
a=0;//     #v4=(Reference,[B);
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a/a;);
a=0;//     invoke-virtual {v1}, Lcn/dm/a/a/a;->m()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/dm/a/d/b;->b(Landroid/content/Context;)Ljava/net/Proxy;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 71
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0, v1}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 76
a=0;//     :goto_0
a=0;//     const v1, 0x9c40
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 77
a=0;//     const v1, 0xea60
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setAllowUserInteraction(Z)V
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v1, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u4e0b\u8f7d\u6587\u4ef6\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
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
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/f/e;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v5, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     const-string v2, "rw"
a=0;// 
a=0;//     invoke-direct {v5, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     #v5=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/a/f;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "chmod 777 "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 86
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-wide v1, p0, Lcn/dm/a/f;->g:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v1, v6
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/c/b;);
a=0;//     invoke-interface {v1}, Lcn/dm/a/c/b;->f()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 173
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 74
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/net/URL;);v1=(Reference,Ljava/net/Proxy;);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(LongLo);v7=(LongHi);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     :cond_3
a=0;//     #v1=(Byte);v2=(LongHi);v3=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/c/b;);
a=0;//     invoke-interface {v1}, Lcn/dm/a/c/b;->g()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 98
a=0;//     const-string v1, "Range"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "bytes="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-wide v6, p0, Lcn/dm/a/f;->g:J
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "-"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-wide v6, p0, Lcn/dm/a/f;->h:J
a=0;// 
a=0;//     invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u4e0b\u8f7dResponseCode\uff1a"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0xce
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v1, v2, :cond_7
a=0;// 
a=0;//     .line 103
a=0;//     iget-wide v1, p0, Lcn/dm/a/f;->g:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v5, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     .line 110
a=0;//     :goto_2
a=0;//     new-instance v6, Ljava/io/BufferedInputStream;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/BufferedInputStream;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v6, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 113
a=0;//     #v6=(Reference,Ljava/io/BufferedInputStream;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 115
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(LongLo);v3=(LongHi);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-wide v0, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->h:J
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     cmp-long v0, v0, v7
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_9
a=0;// 
a=0;//     .line 116
a=0;//     iget-boolean v0, p0, Lcn/dm/a/f;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/dm/a/f;->b:Z
a=0;// 
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 117
a=0;//     :cond_5
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;// 
a=0;//     .line 119
a=0;//     iget-boolean v0, p0, Lcn/dm/a/f;->a:Z
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/c/b;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/a/a/a;);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->d(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lcn/dm/a/f;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/c/b;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->b(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 164
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 165
a=0;//     #v0=(Reference,Ljava/net/SocketTimeoutException;);
a=0;//     sget-object v1, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u4e0b\u8f7d\u8fc7\u7a0b\u4e2d\u7f51\u7edc\u51fa\u73b0\u5f02\u5e38\uff1a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     const-string v1, "\u7f51\u7edc\u8fde\u63a5\u8d85\u65f6,\u8bf7\u68c0\u67e5\u7f51\u7edc"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/a/a/a;->g(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 105
a=0;//     :cond_7
a=0;//     #v1=(Integer);v2=(PosShort);v3=(Integer);v5=(Reference,Ljava/io/RandomAccessFile;);v6=(LongLo);v7=(LongHi);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v5, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
a=0;// 
a=0;//     .line 106
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     iput-wide v1, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     .line 107
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     iput-wide v1, p0, Lcn/dm/a/f;->i:J
a=0;//     :try_end_1
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 169
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 170
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v1, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "\u4e0b\u8f7d\u8fc7\u7a0b\u4e2d\u51fa\u73b0\u5f02\u5e38:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(LongHi);v2=(LongLo);v3=(LongHi);v5=(Reference,Ljava/io/RandomAccessFile;);v6=(Reference,Ljava/io/BufferedInputStream;);v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x2800
a=0;// 
a=0;//     :try_start_2
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v6, v4, v0, v1}, Ljava/io/BufferedInputStream;->read([BII)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 129
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 154
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->f:Ljava/io/File;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {p0, v0}, Lcn/dm/a/f;->a(Ljava/io/File;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/a/c/b;);
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     :goto_4
a=0;//     invoke-virtual {v6}, Ljava/io/BufferedInputStream;->close()V
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v5}, Ljava/io/RandomAccessFile;->close()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 133
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v5, v4, v1, v0}, Ljava/io/RandomAccessFile;->write([BII)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     int-to-long v9, v0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     add-long/2addr v7, v9
a=0;// 
a=0;//     iput-wide v7, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     .line 135
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     iget-wide v9, p0, Lcn/dm/a/f;->h:J
a=0;// 
a=0;//     cmp-long v1, v7, v9
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_b
a=0;// 
a=0;//     .line 136
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v9, p0, Lcn/dm/a/f;->i:J
a=0;// 
a=0;//     iget-wide v11, p0, Lcn/dm/a/f;->h:J
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sub-long/2addr v9, v11
a=0;// 
a=0;//     sub-long/2addr v0, v9
a=0;// 
a=0;//     const-wide/16 v9, 0x1
a=0;// 
a=0;//     add-long/2addr v0, v9
a=0;// 
a=0;//     add-long/2addr v0, v7
a=0;// 
a=0;//     iput-wide v0, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     .line 144
a=0;//     :goto_5
a=0;//     #v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 145
a=0;//     sub-long v7, v0, v2
a=0;// 
a=0;//     const-wide/16 v9, 0x3e8
a=0;// 
a=0;//     cmp-long v7, v7, v9
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-ltz v7, :cond_d
a=0;// 
a=0;//     .line 148
a=0;//     iget-object v2, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/a/a/a;);
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     #v7=(LongLo);
a=0;//     invoke-virtual {v2, v7, v8}, Lcn/dm/a/a/a;->a(J)V
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v2, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v3, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/a/a/a;);
a=0;//     invoke-interface {v2, v3}, Lcn/dm/a/c/b;->c(Lcn/dm/a/a/a;)V
a=0;// 
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     .line 152
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 138
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Byte);v7=(LongLo);
a=0;//     iget-wide v7, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     add-long/2addr v0, v7
a=0;// 
a=0;//     iput-wide v0, p0, Lcn/dm/a/f;->j:J
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 157
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/a/f;->c:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "\u4e0b\u8f7d\u5b8c\u6210\uff0c\u91cd\u547d\u540d\u5931\u8d25\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcn/dm/a/f;->n:Lcn/dm/a/c/b;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/a/f;->o:Lcn/dm/a/a/a;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcn/dm/a/c/b;->e(Lcn/dm/a/a/a;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_d
a=0;//     #v0=(LongLo);v1=(LongHi);v7=(Byte);v9=(LongLo);v10=(LongHi);
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
}}
