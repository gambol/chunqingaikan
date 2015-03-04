package cn.sharesdk.framework; class TitleLayout { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/TitleLayout;
a=0;// .super Landroid/widget/LinearLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private btnRight:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/TitleLayout;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/TitleLayout;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const-string v0, "ssdk_back_arr"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     const/16 v0, 0x30
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {p1, v1}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "ssdk_title_div"
a=0;// 
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     :cond_1
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v0, 0x17
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, v0, v5, v0, v5}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v2, 0x41900000    # 18.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v6, v2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v2, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Typeface;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v2, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const-string v2, "ssdk_title_div"
a=0;// 
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     :cond_2
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v1, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v1, Lcn/sharesdk/framework/r;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/sharesdk/framework/r;);
a=0;//     invoke-direct {v1, p0, p1, v0}, Lcn/sharesdk/framework/r;-><init>(Lcn/sharesdk/framework/TitleLayout;Landroid/content/Context;Landroid/widget/ImageView;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/r;);
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     const/16 v0, 0x32
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setMinWidth(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v1, 0x41400000    # 12.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v6, v1}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBtnBack()Landroid/widget/ImageView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnBack:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBtnRight()Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->btnRight:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTvTitle()Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/TitleLayout;->tvTitle:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
}}
