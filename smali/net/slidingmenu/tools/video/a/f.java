package net.slidingmenu.tools.video.a; class f { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/video/a/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/media/MediaPlayer$OnInfoListener;
a=0;// .implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Landroid/widget/VideoView;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;// .field private g:Landroid/os/Handler;
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/View;Lnet/slidingmenu/tools/video/c;Landroid/view/View$OnClickListener;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/a/f;);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/video/a/f;->c:I
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/a/f;->d:Z
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/video/a/f;->e:I
a=0;// 
a=0;//     iput v1, p0, Lnet/slidingmenu/tools/video/a/f;->h:I
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/a/f;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v1, Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->g:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/VideoView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/VideoView;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/a/f;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/VideoView;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     iput-object p3, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/VideoView;);
a=0;//     invoke-virtual {v1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/c;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/a/f;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lnet/slidingmenu/tools/video/a/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/c;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Lnet/slidingmenu/tools/video/a/c;->setOnCloseBtnListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     check-cast p2, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/video/a/c;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/video/a/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/video/a/g;);
a=0;//     invoke-direct {v2, p0}, Lnet/slidingmenu/tools/video/a/g;-><init>(Lnet/slidingmenu/tools/video/a/f;)V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/video/a/g;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/VideoView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/f;->h()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/a/f;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/video/a/f;->e:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/a/f;)Lnet/slidingmenu/tools/video/a/c;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/a/f;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/a/f;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/a/f;I)I
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/video/a/f;->h:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lnet/slidingmenu/tools/video/a/f;)Landroid/widget/VideoView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lnet/slidingmenu/tools/video/a/f;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/a/f;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lnet/slidingmenu/tools/video/a/f;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/a/f;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private h()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/h;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/a/h;-><init>(Lnet/slidingmenu/tools/video/a/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/h;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->g:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->g:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/i;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/a/i;-><init>(Lnet/slidingmenu/tools/video/a/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/i;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/VideoView;->setVisibility(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
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
a=0;// .method public b()Landroid/widget/VideoView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/j;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/a/j;-><init>(Lnet/slidingmenu/tools/video/a/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/j;);
a=0;//     const-wide/16 v2, 0x1f4
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/widget/VideoView;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->start()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/a/f;->h:I
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/video/a/f;->g()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/video/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/a/f;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/video/a/f;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->resume()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/a/f;->d:Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/a/f;->d:Z
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/a/f;->c:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->suspend()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
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
a=0;// .method public f()V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/VideoView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/VideoView;->destroyDrawingCache()V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->b:Landroid/widget/VideoView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->f:Lnet/slidingmenu/tools/video/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/c;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/a/c;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/d/a/p;->b()V
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->gc()V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g()Z
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/f;->i:Lnet/slidingmenu/tools/video/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/c;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/video/c;->o:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lnet/slidingmenu/tools/b/b/d/g;->a(Ljava/io/File;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->delete()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInfo(Landroid/media/MediaPlayer;II)Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
