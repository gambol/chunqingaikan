package cn.sharesdk.framework.authorize; class RegisterView { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/authorize/RegisterView;
a=0;// .super Lcn/sharesdk/framework/authorize/ResizeLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;// .field private b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private c:Landroid/webkit/WebView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/authorize/ResizeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/authorize/RegisterView;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Lcn/sharesdk/framework/authorize/ResizeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/RegisterView;);
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/authorize/RegisterView;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)V
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v7, -0x2
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/high16 v6, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-virtual {p0, v5}, Lcn/sharesdk/framework/authorize/RegisterView;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lcn/sharesdk/framework/authorize/RegisterView;->setOrientation(I)V
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcn/sharesdk/framework/authorize/RegisterView;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-direct {v0, p1}, Lcn/sharesdk/framework/TitleLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v0, "ssdk_auth_title_back"
a=0;// 
a=0;//     invoke-static {p1, v0}, Lcn/sharesdk/framework/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/TitleLayout;->setBackgroundResource(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/TitleLayout;->getBtnRight()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/authorize/RegisterView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "weibo_oauth_regiseter"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/sharesdk/framework/TitleLayout;->getTvTitle()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/authorize/RegisterView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     const-string v2, "ssdk_logo"
a=0;// 
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {p1, v2}, Lcn/sharesdk/framework/utils/R;->dipToPx(Landroid/content/Context;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v3, v3, v2, v3}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v2, Lcn/sharesdk/framework/authorize/c;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/sharesdk/framework/authorize/c;);
a=0;//     invoke-direct {v2, p0}, Lcn/sharesdk/framework/authorize/c;-><init>(Lcn/sharesdk/framework/authorize/RegisterView;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/authorize/c;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/sharesdk/framework/TitleLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v6, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/RegisterView;->b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/framework/authorize/RegisterView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v2, p0, Lcn/sharesdk/framework/authorize/RegisterView;->b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const v3, -0xc54916
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setBackgroundColor(I)V
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     new-instance v3, Landroid/webkit/WebView;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/webkit/WebView;);
a=0;//     invoke-direct {v3, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/webkit/WebView;);
a=0;//     iput-object v3, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iput v6, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v4, v3}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v3, Lcn/sharesdk/framework/authorize/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/authorize/d;);
a=0;//     invoke-direct {v3, p0, v2, v1}, Lcn/sharesdk/framework/authorize/d;-><init>(Lcn/sharesdk/framework/authorize/RegisterView;Landroid/widget/TextView;I)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/authorize/d;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/webkit/WebView;);
a=0;//     invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/webkit/WebView;->requestFocus()Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Null);v4=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)I
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     instance-of v2, p1, Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Boolean);
a=0;//     check-cast p1, Landroid/app/Activity;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/WindowManager;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Display;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/TitleLayout;->getBtnBack()Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/TitleLayout;->setVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b()Landroid/webkit/WebView;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->c:Landroid/webkit/WebView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/webkit/WebView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Lcn/sharesdk/framework/TitleLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->a:Lcn/sharesdk/framework/TitleLayout;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/TitleLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public d()Landroid/widget/RelativeLayout;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/authorize/RegisterView;->b:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     return-object v0
a=0;// .end method
}}
