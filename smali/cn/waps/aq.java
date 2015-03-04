package cn.waps; class aq { void a() { int a;
a=0;// .class public Lcn/waps/aq;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static d:Z
a=0;// 
a=0;// .field protected static e:Z
a=0;// 
a=0;// .field protected static f:Ljava/util/HashMap;
a=0;// 
a=0;// .field protected static g:Ljava/util/HashMap;
a=0;// 
a=0;// .field protected static h:Landroid/os/Handler;
a=0;// 
a=0;// .field protected static i:Ljava/lang/Integer;
a=0;// 
a=0;// .field protected static q:Z
a=0;// 
a=0;// .field private static x:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Ljava/lang/String;
a=0;// 
a=0;// .field protected b:I
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field j:D
a=0;// 
a=0;// .field k:D
a=0;// 
a=0;// .field l:Ljava/text/NumberFormat;
a=0;// 
a=0;// .field m:Ljava/io/InputStream;
a=0;// 
a=0;// .field n:Ljava/io/FileOutputStream;
a=0;// 
a=0;// .field o:Ljava/lang/String;
a=0;// 
a=0;// .field p:Ljava/lang/String;
a=0;// 
a=0;// .field private r:Ljava/lang/String;
a=0;// 
a=0;// .field private s:Lcn/waps/ad;
a=0;// 
a=0;// .field private t:Lcn/waps/af;
a=0;// 
a=0;// .field private u:Landroid/content/Context;
a=0;// 
a=0;// .field private v:Ljava/lang/String;
a=0;// 
a=0;// .field private w:Ljava/lang/String;
a=0;// 
a=0;// .field private y:Ljava/io/File;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sput-boolean v1, Lcn/waps/aq;->d:Z
a=0;// 
a=0;//     sput-boolean v1, Lcn/waps/aq;->e:Z
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcn/waps/aq;->x:Z
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v0, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     sput-boolean v1, Lcn/waps/aq;->q:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>()V
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aq;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->k:D
a=0;// 
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "#0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->l:Ljava/text/NumberFormat;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "/sdcard/download/"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Looper;->prepare()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aq;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->k:D
a=0;// 
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "#0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->l:Ljava/text/NumberFormat;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "/sdcard/download/"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/aq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aq;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->k:D
a=0;// 
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "#0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->l:Ljava/text/NumberFormat;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "/sdcard/download/"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcn/waps/aq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/aq;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->a:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     iput-wide v3, p0, Lcn/waps/aq;->k:D
a=0;// 
a=0;//     new-instance v0, Ljava/text/DecimalFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/DecimalFormat;);
a=0;//     const-string v1, "#0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/DecimalFormat;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->l:Ljava/text/NumberFormat;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, "/sdcard/download/"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-direct/range {p0 .. p5}, Lcn/waps/aq;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/aq;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     const-string v2, ".apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v0, "."
a=0;// 
a=0;//     invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v3, p0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[Ljava/io/File;);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v4, :cond_3
a=0;// 
a=0;//     aget-object v1, v3, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Integer);v3=(Reference,[Ljava/io/File;);v4=(Integer);v5=(Boolean);
a=0;//     add-int/lit8 v1, v2, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);v2=(Boolean);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1, p2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/aq;->r:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/aq;->v:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ".apk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p4, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iput-object p5, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     :cond_3
a=0;//     new-instance v0, Lcn/waps/ad;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ad;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcn/waps/ad;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ad;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     sget-object v0, Lcn/waps/aq;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcn/waps/aq;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     :cond_4
a=0;//     sget-object v0, Lcn/waps/aq;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lcn/waps/aq;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     :cond_5
a=0;//     invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Looper;->prepare()V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_1
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-object p4, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Reference,Landroid/os/Looper;);v1=(Reference,Landroid/content/Context;);
a=0;//     sget-object v0, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     new-instance v0, Lcn/waps/ar;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ar;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/ar;-><init>(Lcn/waps/aq;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ar;);
a=0;//     sput-object v0, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 12
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     long-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/waps/aq;->b:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     new-instance v0, Lcn/waps/at;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/at;);
a=0;//     invoke-direct {v0}, Lcn/waps/at;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/waps/at;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     const-string v1, ";"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/ad;);
a=0;//     invoke-virtual {v1, v0}, Lcn/waps/ad;->a(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->r:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/ad;);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "getting_filename"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget v2, p0, Lcn/waps/aq;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "0%"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Lcn/waps/ad;->a(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v0, Lcn/waps/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cs;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->r:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v0, v2, :cond_9
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v2, v0
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     iput-wide v2, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     iget-wide v2, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmpg-double v0, v2, v4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_8
a=0;// 
a=0;//     const-string v0, "\u672a\u77e5\u6587\u4ef6\u5927\u5c0f"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_3
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_5
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     :try_start_6
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_4
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_7
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ".apk"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/ad;);
a=0;//     iget v3, p0, Lcn/waps/aq;->b:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "getting_filename"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, " 0%"
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3, v0}, Lcn/waps/ad;->a(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_8
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_6
a=0;//     iget-object v1, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_5
a=0;//     throw v0
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_9
a=0;//     #v0=(Byte);v2=(DoubleLo);v3=(DoubleHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v3, p0, Lcn/waps/aq;->k:D
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     iget-wide v5, p0, Lcn/waps/aq;->j:D
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     iget-object v7, p0, Lcn/waps/aq;->r:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget v8, p0, Lcn/waps/aq;->b:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v9, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v10, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v10=(Reference,Lcn/waps/ad;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     invoke-direct/range {v0 .. v11}, Lcn/waps/aq;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;DDLjava/lang/String;ILjava/io/InputStream;Lcn/waps/ad;Z)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Integer);v2=(PosShort);v3=(Null);v4=(Conflicted);v5=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v2, 0x194
a=0;// 
a=0;//     if-ne v0, v2, :cond_a
a=0;// 
a=0;//     const-string v0, "(404)\u4e0b\u8f7d\u6587\u4ef6\u4e0d\u5b58\u5728"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x1f4
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     const-string v0, "(500)\u670d\u52a1\u7aef\u51fa\u73b0\u9519\u8bef"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "\u670d\u52a1\u5668\u65e0\u54cd\u5e94"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
a=0;//     .catchall {:try_start_9 .. :try_end_9} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/net/HttpURLConnection;Ljava/lang/String;DDLjava/lang/String;ILjava/io/InputStream;Lcn/waps/ad;Z)V
a=0;//     .locals 34
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p7
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-wide/from16 v0, p5
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ";"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p8
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v3, ".apk"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_21
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v5, "."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v22, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v22=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v5}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Down_"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ".txt"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "/Android/data/cache/downloadCache/"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v3, v4, v5, v6, v7}, Lcn/waps/SDKUtils;->saveDataToLocal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->w:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_20
a=0;// 
a=0;//     const-string v3, ".apk"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_20
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "."
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v21, v3
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v21=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "mounted"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     move-wide/from16 v0, p5
a=0;// 
a=0;//     #v0=(DoubleLo);
a=0;//     double-to-int v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Lcn/waps/cs;->a(II)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "/sdcard/download/"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Integer);v7=(Boolean);v8=(Conflicted);
a=0;//     if-ge v3, v5, :cond_1
a=0;// 
a=0;//     aget-object v6, v4, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v8, ".tmp"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);v6=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     iget-object v4, v0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ".tmp"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-nez p11, :cond_3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->mkdir()Z
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v3, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     const-wide/16 v17, 0x0
a=0;// 
a=0;//     #v17=(LongLo);v18=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v23
a=0;// 
a=0;//     #v23=(LongLo);v24=(LongHi);
a=0;//     const-wide/16 v15, 0x0
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v13, 0x0
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     if-eqz p9, :cond_4
a=0;// 
a=0;//     sget-object v6, Lcn/waps/aq;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Boolean;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const v6, 0x19000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v0, v6, [B
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v25=(Reference,[B);
a=0;//     move-wide/from16 v19, v3
a=0;// 
a=0;//     #v19=(LongLo);v20=(LongHi);
a=0;//     move-wide/from16 v6, p3
a=0;// 
a=0;//     :goto_4
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Integer);v6=(DoubleLo);v7=(DoubleHi);v9=(Conflicted);v10=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v4, v3, :cond_9
a=0;// 
a=0;//     sget-object v3, Lcn/waps/aq;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/ad;->a(I)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(DoubleHi);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Reference,Ljava/lang/String;);v22=(Reference,Ljava/lang/String;);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     :cond_6
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,[B);v3=(Boolean);v4=(Integer);v5=(Integer);v6=(DoubleLo);v7=(DoubleHi);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);v17=(LongLo);v18=(LongHi);v19=(LongLo);v20=(LongHi);v21=(Reference,Ljava/lang/String;);v22=(Reference,Ljava/lang/String;);v23=(LongLo);v24=(LongHi);v25=(Reference,[B);
a=0;//     sget-object v3, Lcn/waps/aq;->f:Ljava/util/HashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/HashMap;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/Boolean;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v3, v0, v8, v4}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
a=0;// 
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     int-to-double v8, v4
a=0;// 
a=0;//     #v8=(DoubleLo);v9=(DoubleHi);
a=0;//     add-double v9, v6, v8
a=0;// 
a=0;//     #v9=(DoubleLo);v10=(DoubleHi);
a=0;//     int-to-double v3, v4
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     add-double v19, v19, v3
a=0;// 
a=0;//     #v19=(DoubleLo);v20=(DoubleHi);
a=0;//     sub-double v26, v9, v17
a=0;// 
a=0;//     :try_start_4
a=0;//     #v26=(DoubleLo);v27=(DoubleHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long v3, v6, v23
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-wide/16 v28, 0x3e8
a=0;// 
a=0;//     #v28=(LongLo);v29=(LongHi);
a=0;//     div-long v3, v3, v28
a=0;// 
a=0;//     long-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-long v28, v6, v15
a=0;// 
a=0;//     const-wide/16 v30, 0x3e8
a=0;// 
a=0;//     #v30=(LongLo);v31=(LongHi);
a=0;//     cmp-long v4, v28, v30
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_8
a=0;// 
a=0;//     cmpl-double v4, v9, p5
a=0;// 
a=0;//     if-nez v4, :cond_1f
a=0;// 
a=0;//     :cond_8
a=0;//     sub-long/2addr v6, v11
a=0;// 
a=0;//     const-wide/16 v15, 0x4e20
a=0;// 
a=0;//     cmp-long v4, v6, v15
a=0;// 
a=0;//     if-ltz v4, :cond_1e
a=0;// 
a=0;//     sget-boolean v4, Lcn/waps/aq;->q:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1e
a=0;// 
a=0;//     const-wide/16 v11, 0x0
a=0;// 
a=0;//     cmpl-double v4, v13, v9
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_b
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     sput-boolean v3, Lcn/waps/aq;->q:Z
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     :cond_9
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(LongLo);v20=(LongHi);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_5
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v5, "activity"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/app/ActivityManager;
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v5}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_7
a=0;//     #v3=(Conflicted);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_f
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/app/ActivityManager$RunningTaskInfo;
a=0;// 
a=0;//     iget-object v3, v3, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "PackageInstallerActivity"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_a
a=0;// 
a=0;//     const-string v6, "InstallAppProgress"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1b
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_8
a=0;//     #v3=(Boolean);
a=0;//     move v4, v3
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Reference,[B);v3=(Integer);v4=(Byte);v5=(Integer);v6=(LongLo);v7=(LongHi);v8=(DoubleLo);v9=(DoubleLo);v10=(DoubleHi);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);v17=(LongLo);v19=(DoubleLo);v20=(DoubleHi);v26=(DoubleLo);v27=(DoubleHi);v28=(LongLo);v29=(LongHi);v30=(LongLo);v31=(LongHi);
a=0;//     move-wide v6, v11
a=0;// 
a=0;//     move-wide v11, v9
a=0;// 
a=0;//     :goto_9
a=0;//     const-wide/16 v13, 0x0
a=0;// 
a=0;//     if-nez v3, :cond_1d
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     move v8, v3
a=0;// 
a=0;//     :goto_a
a=0;//     #v3=(Integer);v8=(Integer);
a=0;//     div-double v3, v9, p5
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v15, 0x4059000000000000L    # 100.0
a=0;// 
a=0;//     mul-double/2addr v3, v15
a=0;// 
a=0;//     double-to-int v15, v3
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     const-wide/high16 v3, 0x4090000000000000L    # 1024.0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     div-double v3, v26, v3
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     double-to-int v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v5, v4, :cond_1c
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_b
a=0;//     #v3=(Integer);
a=0;//     int-to-double v0, v8
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     move-wide/from16 v16, v0
a=0;// 
a=0;//     #v16=(DoubleLo);v17=(DoubleHi);
a=0;//     div-double v16, v19, v16
a=0;// 
a=0;//     sub-double v26, p5, v9
a=0;// 
a=0;//     div-double v16, v26, v16
a=0;// 
a=0;//     move-wide/from16 v0, v16
a=0;// 
a=0;//     double-to-int v5, v0
a=0;// 
a=0;//     :try_start_6
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     iget-object v0, v0, Lcn/waps/aq;->l:Ljava/text/NumberFormat;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     #v16=(Reference,Ljava/text/NumberFormat;);
a=0;//     int-to-long v0, v15
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v17, v0
a=0;// 
a=0;//     #v17=(LongLo);
a=0;//     invoke-virtual/range {v16 .. v18}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     const/16 v17, 0x64
a=0;// 
a=0;//     #v17=(PosByte);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_c
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     :try_start_7
a=0;//     #v6=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "failed_to_download"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v3, p10
a=0;// 
a=0;//     move-object/from16 v4, p2
a=0;// 
a=0;//     move/from16 v5, p8
a=0;// 
a=0;//     invoke-virtual/range {v3 .. v8}, Lcn/waps/ad;->a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Integer);
a=0;//     move-exception v3
a=0;// 
a=0;//     :try_start_8
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_8
a=0;//     .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     move-wide v4, v9
a=0;// 
a=0;//     :goto_c
a=0;//     :try_start_9
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);v9=(Conflicted);v10=(Conflicted);v19=(LongLo);v20=(LongHi);v26=(Conflicted);v27=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     sput-boolean v3, Lcn/waps/aq;->q:Z
a=0;// 
a=0;//     div-double v3, v4, p5
a=0;// 
a=0;//     #v3=(DoubleLo);v4=(DoubleHi);
a=0;//     const-wide/high16 v5, 0x4059000000000000L    # 100.0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     mul-double/2addr v3, v5
a=0;// 
a=0;//     double-to-int v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, "download_failed"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, "%"
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "%"
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v5, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v2, p8
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lcn/waps/ad;->b(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     :try_end_9
a=0;//     .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_c
a=0;//     :try_start_a
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Conflicted);v3=(Integer);v4=(Integer);v5=(Integer);v6=(LongLo);v7=(LongHi);v8=(Integer);v9=(DoubleLo);v10=(DoubleHi);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(Integer);v16=(Integer);v17=(PosByte);v19=(DoubleLo);v20=(DoubleHi);v26=(DoubleLo);v27=(DoubleHi);v28=(LongLo);v29=(LongHi);v30=(LongLo);v31=(LongHi);
a=0;//     new-instance v16, Landroid/os/Bundle;
a=0;// 
a=0;//     #v16=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v16=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v17, "notify_title"
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v2, v21
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v17, "notify_id"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     move/from16 v2, p8
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v17, "downSize"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1, v9, v10}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
a=0;// 
a=0;//     const-string v17, "downPercent"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v15, "downSpeed"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v15, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v4, "downMaxSpeed"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v4, "fileSize"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     move-wide/from16 v1, p5
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-virtual {v0, v4, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V
a=0;// 
a=0;//     const-string v4, "usedTime"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4, v8}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v4, "remainTime"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0, v1}, Lcn/waps/aq;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     move-wide/from16 v32, v6
a=0;// 
a=0;//     #v32=(LongLo);v33=(LongHi);
a=0;//     move-wide v7, v11
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     move-wide v5, v13
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     move v11, v3
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-wide v12, v9
a=0;// 
a=0;//     #v12=(DoubleLo);v13=(DoubleHi);
a=0;//     move-wide/from16 v3, v32
a=0;// 
a=0;//     :goto_d
a=0;//     #v2=(Conflicted);v3=(LongLo);v4=(LongHi);v12=(LongLo);v13=(LongHi);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v32=(Conflicted);v33=(Conflicted);
a=0;//     const-wide/16 v14, 0x0
a=0;// 
a=0;//     #v14=(LongLo);v15=(LongHi);
a=0;//     cmp-long v14, v5, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_d
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     :cond_d
a=0;//     const-wide/16 v14, 0x0
a=0;// 
a=0;//     #v14=(LongLo);
a=0;//     cmp-long v14, v3, v14
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-nez v14, :cond_e
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     :cond_e
a=0;//     const/4 v14, 0x1
a=0;// 
a=0;//     #v14=(One);
a=0;//     sput-boolean v14, Lcn/waps/aq;->e:Z
a=0;//     :try_end_a
a=0;//     .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
a=0;// 
a=0;//     move-wide v15, v5
a=0;// 
a=0;//     #v15=(LongLo);v16=(LongHi);
a=0;//     move-wide/from16 v17, v12
a=0;// 
a=0;//     #v17=(LongLo);
a=0;//     move v5, v11
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-wide v13, v7
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     move-wide v11, v3
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     move-wide v6, v9
a=0;// 
a=0;//     #v6=(DoubleLo);v7=(DoubleHi);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     :cond_f
a=0;//     #v1=(Conflicted);v3=(Boolean);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(LongLo);v20=(LongHi);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
a=0;//     if-nez v4, :cond_14
a=0;// 
a=0;//     :cond_10
a=0;//     :try_start_b
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v3, v4, :cond_4
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     sput-boolean v3, Lcn/waps/aq;->e:Z
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-static {v3, v0}, Lcn/waps/at;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "mounted"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_15
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v4, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, ".tmp"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
a=0;// 
a=0;//     :goto_e
a=0;//     #v4=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     sput-boolean v3, Lcn/waps/aq;->d:Z
a=0;// 
a=0;//     new-instance v3, Lcn/waps/cs;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/cs;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/cs;);
a=0;//     invoke-virtual {v3, v9}, Lcn/waps/cs;->e(Ljava/lang/String;)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/Object;);
a=0;//     if-eqz v6, :cond_18
a=0;// 
a=0;//     array-length v3, v6
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-le v3, v4, :cond_18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const-string v4, "AppSettings"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "InstallToast"
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_11
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "["
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "]"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v3}, Lcn/waps/aq;->d(Ljava/lang/String;)V
a=0;//     :try_end_b
a=0;//     .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
a=0;// 
a=0;//     :cond_11
a=0;//     :try_start_c
a=0;//     #v4=(Conflicted);
a=0;//     const-string v3, ".apk"
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "click_to_install"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     move-object/from16 v3, p10
a=0;// 
a=0;//     move-object/from16 v4, v21
a=0;// 
a=0;//     move/from16 v5, p8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcn/waps/ad;->a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;//     :try_end_c
a=0;//     .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
a=0;// 
a=0;//     :goto_f
a=0;//     :try_start_d
a=0;//     #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "{\"pkg\":\""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\"}"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "S1Dc9BDS"
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcn/waps/ap;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Lcn/waps/cs;->b(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     :try_end_d
a=0;//     .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_17
a=0;// 
a=0;//     :try_start_e
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/high16 v5, 0x10000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v4, :cond_12
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/al;->N()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcn/waps/al;->O()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v5, "grant_json"
a=0;// 
a=0;//     invoke-virtual {v4, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_12
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ".apk"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v9, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v9, v3}, Lcn/waps/cs;->d(Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     new-instance v4, Lcn/waps/af;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v0, v1, v2}, Lcn/waps/af;-><init>(Lcn/waps/ad;ILjava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v4, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v5, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     #v5=(Reference,Lcn/waps/af;);
a=0;//     invoke-static {v4, v5}, Lcn/waps/at;->a(Landroid/content/Context;Lcn/waps/af;)V
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->P()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "su"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Process;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/DataOutputStream;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcn/waps/al;->Q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "\n"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Process;->waitFor()I
a=0;//     :try_end_e
a=0;//     .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5
a=0;// 
a=0;//     :cond_13
a=0;//     :goto_10
a=0;//     :try_start_f
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;//     :try_end_f
a=0;//     .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_14
a=0;//     :try_start_10
a=0;//     #v3=(Boolean);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);v9=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     check-cast v3, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/app/Activity;->isFinishing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_10
a=0;// 
a=0;//     const-wide/16 v3, 0x2710
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
a=0;//     :try_end_10
a=0;//     .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :catch_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     :try_start_11
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_15
a=0;//     #v1=(Reference,[B);v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;//     :try_end_11
a=0;//     .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0
a=0;// 
a=0;//     goto/16 :goto_e
a=0;// 
a=0;//     :cond_16
a=0;//     :try_start_12
a=0;//     #v3=(Boolean);v4=(Conflicted);v6=(Reference,[Ljava/lang/Object;);v9=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "download_complete"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     move-object/from16 v3, p10
a=0;// 
a=0;//     move-object/from16 v4, v21
a=0;// 
a=0;//     move/from16 v5, p8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcn/waps/ad;->a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;//     :try_end_12
a=0;//     .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4
a=0;// 
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     :try_start_13
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_f
a=0;// 
a=0;//     :catch_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v3}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v4, 0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     new-instance v3, Lcn/waps/af;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0, v1, v2}, Lcn/waps/af;-><init>(Lcn/waps/ad;ILjava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcn/waps/at;->a(Landroid/content/Context;Lcn/waps/af;)V
a=0;//     :try_end_13
a=0;//     .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_17
a=0;//     :try_start_14
a=0;//     #v1=(Reference,[B);v2=(Conflicted);v4=(Boolean);v6=(Reference,[Ljava/lang/Object;);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v3}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v4, 0x10000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     new-instance v3, Lcn/waps/af;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object/from16 v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v0, v1, v2}, Lcn/waps/af;-><init>(Lcn/waps/ad;ILjava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/af;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v3, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->t:Lcn/waps/af;
a=0;// 
a=0;//     invoke-static {v3, v4}, Lcn/waps/at;->a(Landroid/content/Context;Lcn/waps/af;)V
a=0;//     :try_end_14
a=0;//     .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6
a=0;//     .catchall {:try_start_14 .. :try_end_14} :catchall_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_15
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;//     :try_end_15
a=0;//     .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catch_6
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     :try_start_16
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_16
a=0;//     .catchall {:try_start_16 .. :try_end_16} :catchall_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :try_start_17
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v4, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     :cond_18
a=0;//     #v1=(Reference,[B);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v3}, Lcn/waps/SDKUtils;->isCmwap()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_13
a=0;// 
a=0;//     sget-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ge v3, v4, :cond_1a
a=0;// 
a=0;//     sget-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     sget-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     const-string v7, "\u89e3\u6790\u5305\u9519\u8bef\uff0c\u5c1d\u8bd5\u91cd\u65b0\u4e0b\u8f7d..."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v3, p10
a=0;// 
a=0;//     move-object/from16 v4, v21
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v5, p8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcn/waps/ad;->a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;// 
a=0;//     const-wide/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Lcn/waps/aq;->y:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_19
a=0;//     #v3=(Conflicted);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/ad;->a(I)V
a=0;// 
a=0;//     new-instance v3, Lcn/waps/at;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/waps/at;);
a=0;//     invoke-direct {v3}, Lcn/waps/at;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/at;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v4, v0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p7
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0, v1}, Lcn/waps/at;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :cond_1a
a=0;//     #v3=(Integer);v4=(One);v5=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     sput-object v3, Lcn/waps/aq;->i:Ljava/lang/Integer;
a=0;// 
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     move/from16 v1, p8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/ad;->a(I)V
a=0;// 
a=0;//     const-string v7, "\u89e3\u6790\u5305\u5931\u8d25\uff0c\u70b9\u51fb\u67e5\u770b"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v3, p10
a=0;// 
a=0;//     move-object/from16 v4, v21
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v5, p8
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v3 .. v8}, Lcn/waps/ad;->a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;//     :try_end_17
a=0;//     .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_0
a=0;// 
a=0;//     goto/16 :goto_10
a=0;// 
a=0;//     :catch_7
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(DoubleLo);v7=(DoubleHi);v8=(Conflicted);v9=(Conflicted);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(LongLo);v16=(LongHi);v17=(LongLo);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     move-wide v4, v6
a=0;// 
a=0;//     #v4=(DoubleLo);v5=(DoubleHi);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     :cond_1b
a=0;//     #v3=(Boolean);v4=(Boolean);v5=(Reference,Ljava/util/Iterator;);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_1c
a=0;//     #v1=(Reference,[B);v3=(DoubleLo);v4=(Integer);v5=(Integer);v6=(LongLo);v7=(LongHi);v8=(Integer);v9=(DoubleLo);v10=(DoubleHi);v11=(LongLo);v12=(LongHi);v13=(LongLo);v14=(LongHi);v15=(Integer);v16=(LongHi);v17=(LongLo);v19=(DoubleLo);v20=(DoubleHi);v26=(DoubleLo);v27=(DoubleHi);v28=(LongLo);v29=(LongHi);v30=(LongLo);v31=(LongHi);
a=0;//     move v3, v5
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     :cond_1d
a=0;//     #v4=(Byte);v8=(DoubleLo);v15=(LongLo);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     :cond_1e
a=0;//     #v8=(DoubleLo);
a=0;//     move-wide v6, v11
a=0;// 
a=0;//     move-wide v11, v13
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     :cond_1f
a=0;//     move-wide v3, v11
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-wide v7, v13
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     move v11, v5
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-wide/from16 v12, v17
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     move-wide v5, v15
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     :cond_20
a=0;//     #v1=(DoubleHi);v2=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Null);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);
a=0;//     move-object/from16 v21, p2
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_21
a=0;//     #v5=(Uninit);v6=(Uninit);v7=(Uninit);v21=(Uninit);v22=(Uninit);
a=0;//     move-object/from16 v22, p2
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/waps/aq;)Lcn/waps/ad;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ad;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)V
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/16 v10, 0xce
a=0;// 
a=0;//     #v10=(PosShort);
a=0;//     const-wide/16 v8, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     const-string v0, ";"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     iput-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aget-object v7, v0, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-object v2, v0, v2
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget-object v0, v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/waps/aq;->b:I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ad;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lcn/waps/ad;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/ad;);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Lcn/waps/ad;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/ad;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {v7}, Lcn/waps/at;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0, v2}, Lcn/waps/aq;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->isFile()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->length()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     long-to-double v3, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     cmpl-double v2, v3, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Range;bytes="
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     double-to-int v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "-"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     double-to-int v2, v5
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     :goto_1
a=0;//     new-instance v1, Lcn/waps/cs;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/cs;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v7, v0, v2}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0xc8
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-eq v0, v2, :cond_3
a=0;// 
a=0;//     if-ne v0, v10, :cond_a
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     iput-object v2, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eq v0, v10, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-double v5, v0
a=0;// 
a=0;//     :cond_4
a=0;//     cmpg-double v0, v5, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gtz v0, :cond_8
a=0;// 
a=0;//     const-string v0, "\u672a\u77e5\u6587\u4ef6\u5927\u5c0f"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_5
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Null);v2=(Byte);v3=(LongLo);v4=(LongHi);v5=(DoubleLo);v6=(DoubleHi);v7=(Null);v8=(LongLo);v9=(LongHi);v10=(PosShort);v11=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_8
a=0;//     :try_start_2
a=0;//     #v0=(Byte);v1=(Reference,Ljava/net/HttpURLConnection;);v2=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v2, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     iget v8, p0, Lcn/waps/aq;->b:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v9, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InputStream;);
a=0;//     iget-object v10, p0, Lcn/waps/aq;->s:Lcn/waps/ad;
a=0;// 
a=0;//     #v10=(Reference,Lcn/waps/ad;);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/aq;);
a=0;//     invoke-direct/range {v0 .. v11}, Lcn/waps/aq;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;DDLjava/lang/String;ILjava/io/InputStream;Lcn/waps/ad;Z)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_9
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     :try_start_5
a=0;//     #v0=(Integer);v1=(Reference,Ljava/net/HttpURLConnection;);v2=(PosShort);v3=(LongLo);v4=(LongHi);v5=(DoubleLo);v6=(DoubleHi);v7=(Null);v8=(LongLo);v9=(LongHi);v10=(PosShort);v11=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v2, 0x1a0
a=0;// 
a=0;//     if-ne v0, v2, :cond_d
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
a=0;//     .catchall {:try_start_5 .. :try_end_5} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->m:Ljava/io/InputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     :cond_b
a=0;//     iget-object v1, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->n:Ljava/io/FileOutputStream;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
a=0;// 
a=0;//     :cond_c
a=0;//     :goto_4
a=0;//     throw v0
a=0;// 
a=0;//     :cond_d
a=0;//     :try_start_7
a=0;//     #v0=(Integer);v2=(PosShort);v3=(LongLo);v4=(LongHi);v5=(DoubleLo);v6=(DoubleHi);v7=(Null);v8=(LongLo);v9=(LongHi);v10=(PosShort);v11=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v2, 0x194
a=0;// 
a=0;//     if-ne v0, v2, :cond_e
a=0;// 
a=0;//     const-string v0, "(404)\u4e0b\u8f7d\u6587\u4ef6\u4e0d\u5b58\u5728"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/16 v1, 0x1f4
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_f
a=0;// 
a=0;//     const-string v0, "(500)\u670d\u52a1\u7aef\u51fa\u73b0\u9519\u8bef"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "\u670d\u52a1\u5668\u65e0\u54cd\u5e94"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->c(Ljava/lang/String;)V
a=0;//     :try_end_7
a=0;//     .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
a=0;//     .catchall {:try_start_7 .. :try_end_7} :catchall_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :catch_3
a=0;//     #v1=(Conflicted);v3=(LongLo);v4=(LongHi);v5=(DoubleLo);v6=(DoubleHi);v7=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_10
a=0;//     #v1=(Null);v3=(Uninit);v4=(Uninit);v8=(LongLo);v9=(LongHi);v10=(PosShort);v11=(Uninit);
a=0;//     move-wide v3, v8
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/aq;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     new-instance v1, Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v1}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v2, "installToast"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     sget-object v1, Lcn/waps/aq;->h:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/waps/aq;->v:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcn/waps/aq;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcn/waps/aq;->g:Ljava/util/HashMap;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->v:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-boolean v0, Lcn/waps/aq;->x:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcn/waps/aq;->x:Z
a=0;// 
a=0;//     new-instance v0, Lcn/waps/as;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/as;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/as;-><init>(Lcn/waps/aq;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/as;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->getInstance(Landroid/content/Context;)Lcn/waps/AppConnect;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/aq;->r:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0}, Ljava/lang/Thread;->run()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Lcn/waps/at;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/at;);
a=0;//     invoke-direct {v0}, Lcn/waps/at;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/at;);
a=0;//     iget-object v1, p0, Lcn/waps/aq;->u:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/aq;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/waps/at;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/waps/aq;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
