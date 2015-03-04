package u.aly; class i { void a() { int a;
a=0;// .class public Lu/aly/i;
a=0;// .super Lu/aly/a;
a=0;// .source "UTDIdTracker.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "utdid"
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "android.permission.WRITE_EXTERNAL_STORAGE"
a=0;// 
a=0;// .field private static final c:Ljava/util/regex/Pattern;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     const-string v0, "UTDID\">([^<]+)"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lu/aly/i;->c:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const-string v0, "utdid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lu/aly/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Lu/aly/i;);
a=0;//     iput-object p1, p0, Lu/aly/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 24
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 51
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v1, Lu/aly/i;->c:Ljava/util/regex/Pattern;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/regex/Pattern;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 57
a=0;//     invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 58
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private g()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 32
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lu/aly/i;->h()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 33
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v2=(Boolean);
a=0;//     new-instance v2, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 39
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v2}, Lu/aly/bv;->a(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lu/aly/i;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 41
a=0;//     :try_start_2
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 43
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 47
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v2=(Reference,Ljava/io/FileInputStream;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 41
a=0;//     :try_start_3
a=0;//     invoke-static {v2}, Lu/aly/bv;->c(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 42
a=0;//     throw v0
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// .end method
a=0;// 
a=0;// .method private h()Ljava/io/File;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lu/aly/i;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lu/aly/bi;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v3=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 72
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ".UTSystemConfig/Global/Alvin2.xml"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public f()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Lu/aly/i;->g()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
