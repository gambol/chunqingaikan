package net.slidingmenu.tools.video; class slidingcaxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/video/slidingcaxc;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/media/MediaPlayer$OnCompletionListener;
a=0;// .implements Landroid/media/MediaPlayer$OnErrorListener;
a=0;// .implements Landroid/media/MediaPlayer$OnPreparedListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final a:Ljava/lang/String;
a=0;// 
a=0;// .field private final b:I
a=0;// 
a=0;// .field private final c:I
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;// .field private h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;// .field private i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;// .field private j:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private k:Z
a=0;// 
a=0;// .field private l:Lorg/json/JSONObject;
a=0;// 
a=0;// .field private m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;// .field private n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;// .field private o:Landroid/os/Handler;
a=0;// 
a=0;// .field private p:J
a=0;// 
a=0;// .field private q:Z
a=0;// 
a=0;// .field private r:Z
a=0;// 
a=0;// .field private s:Z
a=0;// 
a=0;// .field private t:Ljava/lang/String;
a=0;// 
a=0;// .field private u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private v:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/slidingcaxc;);
a=0;//     const-string v0, "videojsondata"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->a:Ljava/lang/String;
a=0;// 
a=0;//     const/16 v0, 0x3e9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->b:I
a=0;// 
a=0;//     const/16 v0, 0x3ea
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->c:I
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->p:J
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->r:Z
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->s:Z
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/h;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/h;-><init>(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/h;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/l;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/l;-><init>(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/l;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->v:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;J)J
a=0;//     .locals 0
a=0;// 
a=0;//     iput-wide p1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->p:J
a=0;// 
a=0;//     return-wide p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;)Lnet/slidingmenu/tools/video/a;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;Lnet/slidingmenu/tools/video/a;)Lnet/slidingmenu/tools/video/a;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;Lorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->setContentView(Landroid/view/View;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/video/slidingcaxc;->c(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingcaxc;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/slidingcaxc;)Lnet/slidingmenu/tools/video/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 7
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x4
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v2, v2, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".zip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/index.html"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/d;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "file://"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-direct/range {v0 .. v5}, Lnet/slidingmenu/tools/video/d;-><init>(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/d;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lnet/slidingmenu/tools/video/d;->setVideoActivity(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->v:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Lnet/slidingmenu/tools/video/a/f;-><init>(Landroid/content/Context;Landroid/view/View;Lnet/slidingmenu/tools/video/c;Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->b()Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->b()Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->b()Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/k;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/i/k;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->c(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/d;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v4=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v4, v4, Lnet/slidingmenu/tools/video/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lnet/slidingmenu/tools/video/d;-><init>(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/d;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Lnet/slidingmenu/tools/video/d;->setVideoActivity(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Reference,Landroid/widget/RelativeLayout;);v3=(Reference,Lnet/slidingmenu/tools/video/c;);v4=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->c()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/a/f;->a(I)V
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->b(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/a;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->t:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-direct {v0, v1, p1, v2, v3}, Lnet/slidingmenu/tools/video/a;-><init>(Landroid/content/Context;ILjava/lang/String;Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->show()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->b()Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->e()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/slidingcaxc;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/video/slidingcaxc;->b(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/slidingcaxc;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->r:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lnet/slidingmenu/tools/video/slidingcaxc;)Lnet/slidingmenu/tools/video/c;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/c;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/video/c;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/video/c;->a:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "pn"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "name"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "video"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "app"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "url"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "dvt"
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/video/c;->j:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "tips"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "itips"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "path"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "dpath"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "md5"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->n:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v2, "vmd5"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lnet/slidingmenu/tools/video/c;->o:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private c(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/video/a/f;->a(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/video/slidingcaxc;->b(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lnet/slidingmenu/tools/video/slidingcaxc;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lnet/slidingmenu/tools/video/slidingcaxc;)Lorg/json/JSONObject;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->b()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lnet/slidingmenu/tools/video/slidingcaxc;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lnet/slidingmenu/tools/video/slidingcaxc;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lnet/slidingmenu/tools/video/slidingcaxc;)J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->p:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic k(Lnet/slidingmenu/tools/video/slidingcaxc;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic l(Lnet/slidingmenu/tools/video/slidingcaxc;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->r:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/m;);
a=0;//     invoke-direct {v0, p0, p1}, Lnet/slidingmenu/tools/video/m;-><init>(Lnet/slidingmenu/tools/video/slidingcaxc;I)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/m;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public changeUI()V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lnet/slidingmenu/tools/video/d;->a(IIF)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/video/d;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->a(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->b()Landroid/widget/VideoView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/k;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/k;-><init>(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/k;);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/widget/VideoView;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/d;->getWebView()Lnet/slidingmenu/tools/b/a/i/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/g;->removeAllViews()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/d;->getWebView()Lnet/slidingmenu/tools/b/a/i/a/g;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/i/a/g;->destroy()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/d;->removeAllViews()V
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->f()V
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->f:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->dismiss()V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     return-void
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->s:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget v2, v2, Lnet/slidingmenu/tools/video/c;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget v2, v2, Lnet/slidingmenu/tools/video/c;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/video/slidingccxc;->a(Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public hide()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->finish()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->b(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCompletion(Landroid/media/MediaPlayer;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget v2, v2, Lnet/slidingmenu/tools/video/c;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget v2, v2, Lnet/slidingmenu/tools/video/c;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/video/slidingccxc;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Lnet/slidingmenu/tools/video/slidingccxc;->a(J)V
a=0;// 
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->a(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->h:Lnet/slidingmenu/tools/video/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->changeUI()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/d;);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->finish()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/16 v2, 0x400
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->requestWindowFeature(I)Z
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->r:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->s:Z
a=0;// 
a=0;//     iput-object p0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/video/slidingccxc;->getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/slidingccxc;->c:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "adStr"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "interruptTips"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->t:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "dialogType"
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->c()V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->a()V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->m:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v1, v2, v3}, Lnet/slidingmenu/tools/video/slidingccxc;->a(Lnet/slidingmenu/tools/video/c;Lorg/json/JSONObject;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/i/k;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Lnet/slidingmenu/tools/video/slidingcaxc;->b(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "id"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     :try_start_1
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ".CCFFFA1D25C44B08BC24C3C6D8D6666F"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/c/a/b;->a(Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/d/a/a;->a(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v2, v2, Lnet/slidingmenu/tools/video/c;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v2, v2, Lnet/slidingmenu/tools/video/c;->n:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/io/File;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "hpk"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/a/e/b/d;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/a/e/b/d;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "videojsondata"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-wide/16 v4, -0x1
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Lnet/slidingmenu/tools/b/a/e/b/d;->a(Ljava/lang/String;Ljava/lang/String;J)Z
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v2, v2, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     if-ne v0, v6, :cond_4
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->b()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->l:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "hpk"
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_4
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->c(I)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->finish()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_5
a=0;//     :try_start_5
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(LongLo);v5=(LongHi);
a=0;//     new-instance v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->e:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/i;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/i;-><init>(Lnet/slidingmenu/tools/video/slidingcaxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/i;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Integer);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->dismiss()V
a=0;// 
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Landroid/media/MediaPlayer;II)Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->o:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->n:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/slidingcaxc;->dismiss()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     return v2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->e()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepared(Landroid/media/MediaPlayer;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ProgressBar;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->a()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->i:Lnet/slidingmenu/tools/video/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a;->dismiss()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->s:Z
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingcaxc;->a(I)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->s:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->d()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public replay()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->k:Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingcaxc;->g:Lnet/slidingmenu/tools/video/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/video/a/f;->c()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
