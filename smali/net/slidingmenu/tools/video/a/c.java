package net.slidingmenu.tools.video.a; class c { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/video/a/c;
a=0;// .super Lnet/slidingmenu/tools/video/a/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private final g:Landroid/os/Handler;
a=0;// 
a=0;// .field private final h:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/video/a/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/a/c;);
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/a/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->g:Landroid/os/Handler;
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/a/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/a/d;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/a/d;-><init>(Lnet/slidingmenu/tools/video/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/a/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->h:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/c;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p1}, Lnet/slidingmenu/tools/d/a/t;->b(Landroid/content/Context;Landroid/view/View;)Landroid/animation/ObjectAnimator;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/a/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/c;->d()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p1}, Lnet/slidingmenu/tools/d/a/t;->c(Landroid/content/Context;Landroid/view/View;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/c;->a(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/c;->a(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/c;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/d/a/t;->b(Landroid/content/Context;Landroid/view/View;)Landroid/animation/ObjectAnimator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/a/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/a/e;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/video/a/e;-><init>(Lnet/slidingmenu/tools/video/a/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/a/e;);
a=0;//     invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
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
a=0;// .method private e()V
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/c;->f()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->g:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/c;->h:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     const-wide/16 v2, 0xdac
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
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
a=0;// .method private f()V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->g:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/a/c;->h:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
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
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/a/c;->f:Z
a=0;// 
a=0;//     invoke-super {p0}, Lnet/slidingmenu/tools/video/a/a;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/a/c;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/c;->e()V
a=0;// 
a=0;//     invoke-super {p0}, Lnet/slidingmenu/tools/video/a/a;->b()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/video/a/c;->f:Z
a=0;// 
a=0;//     invoke-super {p0}, Lnet/slidingmenu/tools/video/a/a;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->a:Landroid/widget/ImageButton;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageButton;);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/c;->b(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->c:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/c;->b(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/a/c;->b:Lnet/slidingmenu/tools/d/a/p;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/video/a/c;->b(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/a/c;->e()V
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
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
