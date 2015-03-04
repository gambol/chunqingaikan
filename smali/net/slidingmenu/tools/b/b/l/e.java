package net.slidingmenu.tools.b.b.l; class e { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/l/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/view/WindowManager;
a=0;// 
a=0;// .field private b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;// .field private c:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private d:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/l/e;);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/o;->d(Landroid/content/Context;)Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->a:Landroid/view/WindowManager;
a=0;// 
a=0;//     new-instance v0, Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput p3, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->x:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v3, v0, Landroid/view/WindowManager$LayoutParams;->y:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v2, v0, Landroid/view/WindowManager$LayoutParams;->format:I
a=0;// 
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/k;->i(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/16 v1, 0x7d3
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v2, v0, Landroid/view/WindowManager$LayoutParams;->height:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     iput v2, v0, Landroid/view/WindowManager$LayoutParams;->width:I
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/b/b/l/e;->d:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/l/e;->d:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(PosByte);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/16 v1, 0x7d5
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/view/animation/Animation;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/l/e;->a()Z
a=0;// 
a=0;//     invoke-virtual {p1, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->d:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->a:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/l/e;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/l/e;->b:Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/l/e;->a:Landroid/view/WindowManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/WindowManager;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/l/e;->c:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Landroid/view/animation/Animation;)V
a=0;//     .locals 1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/l/e;->b()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
