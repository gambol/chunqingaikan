package net.slidingmenu.tools.b.a.j; class d { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/j/d;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private b:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private d:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private e:Landroid/widget/TextView;
a=0;// 
a=0;// .field private f:Landroid/widget/TextView;
a=0;// 
a=0;// .field private g:Landroid/widget/TextView;
a=0;// 
a=0;// .field private h:Landroid/widget/TextView;
a=0;// 
a=0;// .field private i:Landroid/widget/TextView;
a=0;// 
a=0;// .field private j:Landroid/widget/TextView;
a=0;// 
a=0;// .field private k:Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;// .field private l:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private m:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private n:Landroid/view/View;
a=0;// 
a=0;// .field private o:I
a=0;// 
a=0;// .field private p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Lnet/slidingmenu/tools/b/a/j/a;Lnet/slidingmenu/tools/b/a/j/j;Z)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/j/d;);
a=0;//     const-string v0, "#FFFFBB34"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->o:I
a=0;// 
a=0;//     iput-object p3, p0, Lnet/slidingmenu/tools/b/a/j/d;->k:Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     invoke-direct {p0, p1, p4}, Lnet/slidingmenu/tools/b/a/j/d;->a(Landroid/content/Context;Z)V
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/b/a/j/d;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/b/a/j/d;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(I)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     div-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     add-int/lit8 v5, v0, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);v6=(Conflicted);
a=0;//     if-ge v2, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     mul-int/lit8 v6, v2, 0x3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int v6, v0, v6
a=0;// 
a=0;//     add-int/lit8 v0, v6, -0x3
a=0;// 
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     add-int/lit8 v0, v6, -0x3
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     add-int/lit8 v0, v5, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v2, v0, :cond_0
a=0;// 
a=0;//     const-string v0, ","
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v0, v2, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/a;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setPoints(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/a;);
a=0;//     iget-object v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->d:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setPointsUnit(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/j/d;->setBackBtnVisibiity(I)V
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/a;);
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/j/d;->setPointsLayoutVisibility(I)V
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/a;);
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/j/d;->setLogoVisibility(I)V
a=0;// 
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v2}, Lnet/slidingmenu/tools/b/a/j/d;->setBackBtnVisibiity(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v2}, Lnet/slidingmenu/tools/b/a/j/d;->setPointsLayoutVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setLogoVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v1}, Lnet/slidingmenu/tools/b/a/j/d;->setOrientation(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->p:Lnet/slidingmenu/tools/b/a/j/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/a;);
a=0;//     iget v0, v0, Lnet/slidingmenu/tools/b/a/j/a;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->o:I
a=0;// 
a=0;//     :cond_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->o:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/view/View;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/View;);
a=0;//     invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->n:Landroid/view/View;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->n:Landroid/view/View;
a=0;// 
a=0;//     const-string v1, "#20999999"
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->n:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->n:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/b/a/j/d;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/i;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p0, v2}, Lnet/slidingmenu/tools/b/a/j/i;-><init>(Lnet/slidingmenu/tools/b/a/j/d;I)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/i;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->m:Landroid/view/GestureDetector;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/g;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/a/j/g;-><init>(Lnet/slidingmenu/tools/b/a/j/d;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/g;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/i;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {v1, p0, v2}, Lnet/slidingmenu/tools/b/a/j/i;-><init>(Lnet/slidingmenu/tools/b/a/j/d;I)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/i;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->l:Landroid/view/GestureDetector;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/a/j/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/a/j/h;);
a=0;//     invoke-direct {v1, p0}, Lnet/slidingmenu/tools/b/a/j/h;-><init>(Lnet/slidingmenu/tools/b/a/j/d;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/a/j/h;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/b/a/j/d;)Landroid/view/GestureDetector;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->m:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 10
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/high16 v8, 0x40a00000    # 5.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/b;->k()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/k/b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/high16 v4, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p1, v4}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v1, 0x42480000    # 50.0f
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     const/high16 v2, 0x420c0000    # 35.0f
a=0;// 
a=0;//     invoke-static {p1, v2}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/high16 v4, 0x40000000    # 2.0f
a=0;// 
a=0;//     invoke-static {p1, v4}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41700000    # 15.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41300000    # 11.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "#40000000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     const v4, -0x333334
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41b00000    # 22.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "#13000000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {v0, v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v7, v1, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     invoke-virtual {v0, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41b00000    # 22.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     const-string v1, "#13000000"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v1, 0x3f800000    # 1.0f
a=0;// 
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-direct {v0, v1, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v7, v1, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     invoke-virtual {v0, v7, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/high16 v1, 0x41700000    # 15.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v7, v2, v7}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     invoke-virtual {v0, v7, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxEms(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/TextUtils$TruncateAt;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/high16 v0, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setId(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v2, 0x41100000    # 9.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v5, v2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->o:I
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v2, 0x40400000    # 3.0f
a=0;// 
a=0;//     invoke-static {p1, v2}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/high16 v3, 0x40400000    # 3.0f
a=0;// 
a=0;//     invoke-static {p1, v3}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v3, v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v7, v3, v0}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v2, Landroid/text/style/StyleSpan;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/text/style/StyleSpan;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/text/style/StyleSpan;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1}, Landroid/text/SpannableString;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     const/16 v5, 0x12
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Lnet/slidingmenu/tools/b/a/j/e;
a=0;// 
a=0;//     #v2=(UninitRef,Lnet/slidingmenu/tools/b/a/j/e;);
a=0;//     invoke-direct {v2, p0, v0}, Lnet/slidingmenu/tools/b/a/j/e;-><init>(Lnet/slidingmenu/tools/b/a/j/d;I)V
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/a/j/e;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v6, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v8}, Lnet/slidingmenu/tools/b/b/k/e;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->c:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->t()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lnet/slidingmenu/tools/b/a/j/d;)Landroid/view/GestureDetector;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->l:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lnet/slidingmenu/tools/b/a/j/d;)Lnet/slidingmenu/tools/b/a/j/j;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->k:Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/j;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->k:Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/a/j/j;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->k:Lnet/slidingmenu/tools/b/a/j/j;
a=0;// 
a=0;//     invoke-interface {v0}, Lnet/slidingmenu/tools/b/a/j/j;->d()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setBackBtnVisibiity(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->d:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogoVisibility(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->h:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPoints(I)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->a(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v1, Landroid/text/style/TypefaceSpan;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/style/TypefaceSpan;);
a=0;//     const-string v2, "sans-serif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/style/TypefaceSpan;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Landroid/text/SpannableString;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->e:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPointsLayoutVisibility(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->j:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPointsUnit(Ljava/lang/CharSequence;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v1, Landroid/text/style/TypefaceSpan;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/style/TypefaceSpan;);
a=0;//     const-string v2, "sans-serif"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/style/TypefaceSpan;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Landroid/text/SpannableString;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->f:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v1, Landroid/text/style/StyleSpan;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/text/style/StyleSpan;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v1, v2}, Landroid/text/style/StyleSpan;-><init>(I)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/text/style/StyleSpan;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0}, Landroid/text/SpannableString;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/j/d;->g:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setTitleBackgroundColor(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/a/j/d;->o:I
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lnet/slidingmenu/tools/b/a/j/d;->setBackgroundColor(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
