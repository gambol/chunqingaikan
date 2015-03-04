package cn.waps.a; class c { void a() { int a;
a=0;// .class public Lcn/waps/a/c;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljava/util/List;
a=0;// 
a=0;// .field private b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Lcn/waps/a/f;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method protected constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/util/DisplayMetrics;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/c;);
a=0;//     const/16 v0, 0x28
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcn/waps/a/c;->e:I
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcn/waps/a/c;->f:Landroid/os/Handler;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/a/c;->a:Ljava/util/List;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(II)Landroid/view/View;
a=0;//     .locals 9
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/waps/a/c;->a(I)Lcn/waps/a/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/e;);
a=0;//     iget-object v1, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget v2, p0, Lcn/waps/a/c;->e:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v3=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v1, v2, v3}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iget-object v4, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v4=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v2, v3, v4}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v4, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v4, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v5, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     iget-object v5, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-object v7, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v7=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v5, v6, v7}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     iget-object v8, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v8=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v6, v7, v8}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v5, v6, v7, v6}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v5, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v5, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/ImageView;);
a=0;//     iget-object v6, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v6, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v6, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v1, v0, Lcn/waps/a/e;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v6, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v1, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v0, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v7, -0x2
a=0;// 
a=0;//     invoke-direct {v0, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     const/16 v2, 0x50
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     iget-object v6, p0, Lcn/waps/a/c;->b:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v6=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-static {v0, v2, v6}, Lcn/waps/a/o;->a(Landroid/content/Context;ILandroid/util/DisplayMetrics;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v1, v0, v2, v6, v7}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v1, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v1, 0xff
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v2, 0x96
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const/16 v5, 0x96
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     const/16 v6, 0x96
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-static {v1, v2, v5, v6}, Landroid/graphics/Color;->argb(IIII)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {v1, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method private a(I)Lcn/waps/a/e;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Lcn/waps/a/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/a/e;);
a=0;//     invoke-direct {v0, p0}, Lcn/waps/a/e;-><init>(Lcn/waps/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/e;);
a=0;//     iget-object v1, p0, Lcn/waps/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcn/waps/a/g;->a(Landroid/content/Context;)Lcn/waps/a/g;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcn/waps/a/g;->b(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     const-string v2, "\u817e\u8baf\u5fae\u535a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iput-object v1, v0, Lcn/waps/a/e;->a:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(PosByte);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     const-string v2, "\u670b\u53cb\u5708"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(One);
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne p1, v2, :cond_3
a=0;// 
a=0;//     const-string v2, "\u624b\u673aQQ"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v2=(PosByte);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     if-ne p1, v2, :cond_4
a=0;// 
a=0;//     const-string v2, "QQ\u7a7a\u95f4"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(PosByte);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     if-ne p1, v2, :cond_5
a=0;// 
a=0;//     const-string v2, "\u5fae\u4fe1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v2=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     const-string v2, "\u65b0\u6d6a\u5fae\u535a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v0, Lcn/waps/a/e;->b:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/waps/a/c;)Lcn/waps/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/c;->d:Lcn/waps/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Lcn/waps/a/f;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/a/c;->d:Lcn/waps/a/f;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/c;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/c;->a:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, p1}, Lcn/waps/a/c;->a(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     new-instance v2, Lcn/waps/a/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/waps/a/d;);
a=0;//     invoke-direct {v2, p0, v0}, Lcn/waps/a/d;-><init>(Lcn/waps/a/c;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/waps/a/d;);
a=0;//     invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
