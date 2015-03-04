package net.slidingmenu.tools.b.a.j.b; class f { void a() { int a;
a=0;// .class public abstract Lnet/slidingmenu/tools/b/a/j/b/f;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Landroid/view/View;
a=0;// 
a=0;// .field private b:F
a=0;// 
a=0;// .field private c:Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;// 
a=0;// .field private d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;// .field private i:Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;// .field private j:Z
a=0;// 
a=0;// .field private k:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public varargs constructor <init>(Landroid/content/Context;[Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/f;);
a=0;//     const/high16 v0, -0x40800000    # -1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/b/c;->a:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->j:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(Landroid/content/Context;[Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-wide/16 v2, 0x96
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/f;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(IJJ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(IJJ)V
a=0;//     .locals 6
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->i:Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/m;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->i:Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/j/b/m;->a()V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/m;);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/f;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-wide v4, p2
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct/range {v0 .. v5}, Lnet/slidingmenu/tools/b/a/j/b/m;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;IIJ)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/m;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->i:Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->i:Lnet/slidingmenu/tools/b/a/j/b/m;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p4, p5}, Lnet/slidingmenu/tools/b/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private varargs a(Landroid/content/Context;[Ljava/lang/Object;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/b/f;->setOrientation(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Lnet/slidingmenu/tools/b/a/j/b/f;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->g:I
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/a;);
a=0;//     invoke-direct {v0, p1}, Lnet/slidingmenu/tools/b/a/j/b/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/a;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/j/b/f;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lnet/slidingmenu/tools/b/a/j/b/f;->b(Landroid/content/Context;[Ljava/lang/Object;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/j/b/f;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/b/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/g;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/a/j/b/g;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/g;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->g()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/a/j/b/f;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/a/j/b/f;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->j:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/b/a/j/b/f;)Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lnet/slidingmenu/tools/b/a/j/b/f;)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lnet/slidingmenu/tools/b/a/j/b/f;)Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->c:Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/l;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private g()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/a/j/b/d;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);
a=0;//     invoke-virtual {v1}, Lnet/slidingmenu/tools/b/a/j/b/d;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v0, v1, v2, v3}, Lnet/slidingmenu/tools/b/a/j/b/f;->setPadding(IIII)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(F)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpg-float v0, p1, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float/2addr v0, p1
a=0;// 
a=0;//     cmpl-float v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v1}, Lnet/slidingmenu/tools/b/a/j/b/f;->scrollTo(II)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     float-to-int v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Lnet/slidingmenu/tools/b/a/j/b/f;->scrollBy(II)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/b/c;->c:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/j/b/d;->setState(Lnet/slidingmenu/tools/b/a/j/b/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/b/c;->b:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(II)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     iget v1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, p2, :cond_0
a=0;// 
a=0;//     iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->requestLayout()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected abstract a()Z
a=0;// .end method
a=0;// 
a=0;// .method protected varargs abstract b(Landroid/content/Context;[Ljava/lang/Object;)Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method public b()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/i;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/i;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/j/b/i;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/i;);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/b/f;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected c()V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->e()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v0, v2, :cond_0
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->e:I
a=0;// 
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-direct {p0, v3}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected d()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/a/j/b/c;->d:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/b/a/j/b/d;->setState(Lnet/slidingmenu/tools/b/a/j/b/c;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/b/c;->d:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->c:Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/j;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/j/b/j;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/j;);
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected e()Z
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     sget-object v1, Lnet/slidingmenu/tools/b/a/j/b/c;->d:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public f()V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->e()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/b/a/j/b/c;->a:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/k;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/k;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/j/b/k;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/k;);
a=0;//     const-wide/16 v1, 0x96
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/a/j/b/f;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->c()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getHeaderLoadingLayout()Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->d:Lnet/slidingmenu/tools/b/a/j/b/d;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/d;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRefreshableView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->a:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->j:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);v2=(Boolean);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     if-ne v2, v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     packed-switch v2, :pswitch_data_1
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v3=(Integer);v4=(Conflicted);
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v1=(One);v3=(PosByte);v4=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->g:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v3, v3, v4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_6
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->e()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-gtz v3, :cond_7
a=0;// 
a=0;//     const/high16 v3, 0x3f000000    # 0.5f
a=0;// 
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     #v2=(Float);
a=0;//     move v0, v1
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Null);v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected final onSizeChanged(IIII)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->g()V
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(II)V
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/a/j/b/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/a/j/b/h;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/b/a/j/b/h;-><init>(Lnet/slidingmenu/tools/b/a/j/b/f;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/b/h;);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/b/f;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->j:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(One);v1=(Null);v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->b:F
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->a()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-float v1, v2, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/j/b/f;->a(F)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Null);
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(One);v2=(Integer);v3=(Uninit);
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->k:Z
a=0;// 
a=0;//     iget-boolean v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iput-boolean v1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->f:Z
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->a()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->h:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     sget-object v3, Lnet/slidingmenu/tools/b/a/j/b/c;->c:Lnet/slidingmenu/tools/b/a/j/b/c;
a=0;// 
a=0;//     #v3=(Reference,Lnet/slidingmenu/tools/b/a/j/b/c;);
a=0;//     if-ne v2, v3, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->d()V
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/a/j/b/f;->c()V
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(One);v1=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setOnRefreshListener(Lnet/slidingmenu/tools/b/a/j/b/l;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/a/j/b/f;->c:Lnet/slidingmenu/tools/b/a/j/b/l;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
