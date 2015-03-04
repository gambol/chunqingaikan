package cn.waps; class be { void a() { int a;
a=0;// .class Lcn/waps/be;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Ljava/util/List;
a=0;// 
a=0;// .field c:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic d:Lcn/waps/ay;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/waps/ay;Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/be;->d:Lcn/waps/ay;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/be;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/be;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/be;->b:Ljava/util/List;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/be;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/be;->b:Ljava/util/List;
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
a=0;//     iget-object v0, p0, Lcn/waps/be;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;// 
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 11
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v0, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v2, v0, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v0, p0, Lcn/waps/be;->b:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcn/waps/AdInfo;
a=0;// 
a=0;//     new-instance v3, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     iget-object v4, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v4, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/widget/ImageView;);
a=0;//     iget-object v5, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setId(I)V
a=0;// 
a=0;//     new-instance v5, Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v6, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     sget-object v6, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4}, Landroid/widget/ImageView;->getId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     const/16 v6, 0xf
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     new-instance v6, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdIcon()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-direct {v6, v7}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Lcn/waps/be;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdPackage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, " (\u9ed8\u8ba4)"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     const/high16 v6, -0x1000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     new-instance v6, Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v6, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, " "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/AdInfo;->getAdText()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v7, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     const/16 v7, 0x10
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     iget-object v7, p0, Lcn/waps/be;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v7}, Lcn/waps/SDKUtils;->getDisplaySize(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0xf0
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     if-ne v7, v8, :cond_1
a=0;// 
a=0;//     new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v8, 0x23
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v9, 0x23
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-direct {v7, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v7, v8, v9, v10}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8, v9, v10}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v5, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v7=(Integer);v8=(PosShort);v9=(Uninit);v10=(Uninit);
a=0;//     const/16 v8, 0x140
a=0;// 
a=0;//     if-ne v7, v8, :cond_2
a=0;// 
a=0;//     new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v8, 0x37
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v9, 0x37
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-direct {v7, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v7, v8, v9, v10}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     const/4 v8, 0x4
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v9, 0x4
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8, v9, v10}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v5, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x7
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v7=(Integer);v8=(PosShort);v9=(Uninit);v10=(Uninit);
a=0;//     const/16 v8, 0x438
a=0;// 
a=0;//     if-ne v7, v8, :cond_3
a=0;// 
a=0;//     new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v8, 0x78
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v9, 0x78
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-direct {v7, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/16 v7, 0xf
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v7, v8, v9, v10}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8, v9, v10}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v5, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v7=(Integer);v8=(PosShort);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v8, 0x4b
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/16 v9, 0x4b
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     invoke-direct {v7, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/16 v7, 0xf
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v3, v7, v8, v9, v10}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     const/4 v8, 0x5
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v9, 0x5
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v10, 0x5
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v4, v7, v8, v9, v10}, Landroid/widget/ImageView;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {v5, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     const/16 v7, 0xa
a=0;// 
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v9, v10}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
