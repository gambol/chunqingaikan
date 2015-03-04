package com.twocloo.com.cn.activitys; class MyUserCneterActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "MyUserCneterActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "NewApi"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$MyTask;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CWJ_HEAP_SIZE:I = 0x600000
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private addFriendButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private diagButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private edituserButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private fensiButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private galleryImageAdapter:Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;
a=0;// 
a=0;// .field private gridView:Landroid/widget/GridView;
a=0;// 
a=0;// .field private guanzhuButton:Landroid/widget/Button;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private listView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;// .field private mScrollView:Landroid/widget/HorizontalScrollView;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;
a=0;// 
a=0;// .field private photo_List:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private userLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private userLogo:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;// .field private username:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private blur(Landroid/graphics/Bitmap;Landroid/view/View;)V
a=0;//     .locals 10
a=0;//     .param p1, "bkg"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .annotation build Landroid/annotation/SuppressLint;
a=0;//         value = {
a=0;//             "NewApi"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 182
a=0;//     #v8=(Null);
a=0;//     const/high16 v4, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 183
a=0;//     .local v4, "scaleFactor":F
a=0;//     #v4=(Integer);
a=0;//     const/high16 v3, 0x41a00000    # 20.0f
a=0;// 
a=0;//     .line 184
a=0;//     .local v3, "radius":F
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v4
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     .line 185
a=0;//     #v6=(Integer);
a=0;//     sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 184
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v5, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 186
a=0;//     .local v1, "overlay":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 187
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v5, v4
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     neg-int v6, v6
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v4
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 188
a=0;//     div-float v5, v9, v4
a=0;// 
a=0;//     div-float v6, v9, v4
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 190
a=0;//     .local v2, "paint":Landroid/graphics/Paint;
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setFlags(I)V
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v0, p1, v8, v8, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 192
a=0;//     float-to-int v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v1, v5, v6}, Lcom/twocloo/com/cn/utils/FastBlur;->doBlur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v5, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-direct {v5, v6, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->mainLayout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 126
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->phpto_gridview:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/GridView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     .line 127
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->HorizontalListView:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->listView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     .line 128
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_set:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->edituserButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 129
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->login_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->userLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->edituserButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 131
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_logo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->userLogo:Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     .line 132
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->username:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->username:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 133
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_fensi:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->fensiButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 134
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_guanzhu:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->guanzhuButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 135
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_add_friend:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->addFriendButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 136
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->support_count:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->diagButton:Landroid/widget/Button;
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->addFriendButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->diagButton:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private rblur(Landroid/graphics/Bitmap;Landroid/view/View;)V
a=0;//     .locals 10
a=0;//     .param p1, "bkg"    # Landroid/graphics/Bitmap;
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 197
a=0;//     #v8=(Null);
a=0;//     const/high16 v4, 0x41a00000    # 20.0f
a=0;// 
a=0;//     .line 198
a=0;//     .local v4, "scaleFactor":F
a=0;//     #v4=(Integer);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     .line 199
a=0;//     .local v3, "radius":F
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v5, v4
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v4
a=0;// 
a=0;//     float-to-int v6, v6
a=0;// 
a=0;//     .line 200
a=0;//     #v6=(Integer);
a=0;//     sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     .line 199
a=0;//     #v7=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v5, v6, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 201
a=0;//     .local v1, "overlay":Landroid/graphics/Bitmap;
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 202
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     div-float/2addr v5, v4
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     neg-int v6, v6
a=0;// 
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float/2addr v6, v4
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 203
a=0;//     div-float v5, v9, v4
a=0;// 
a=0;//     div-float v6, v9, v4
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->scale(FF)V
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 205
a=0;//     .local v2, "paint":Landroid/graphics/Paint;
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setFlags(I)V
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {v0, p1, v8, v8, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 207
a=0;//     float-to-int v5, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v1, v5, v6}, Lcom/twocloo/com/cn/utils/FastBlur;->doBlur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 208
a=0;//     new-instance v5, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-direct {v5, v6, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     invoke-virtual {p2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 209
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setValue()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->galleryImageAdapter:Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->listView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->galleryImageAdapter:Lcom/twocloo/com/cn/adapters/GalleryImageAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->edituserButton:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->addFriendButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 165
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/AddFriendActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->diagButton:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/DragSupportActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 75
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->my_center_new:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->initView()V
a=0;// 
a=0;//     .line 77
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v0, Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photo_List:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->photoGridviewAdapter:Lcom/twocloo/com/cn/adapters/PhotoGridviewAdapter;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->gridView:Landroid/widget/GridView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->listView:Lcom/twocloo/com/cn/view/HorizontalListView;
a=0;// 
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$3;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$3;);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/view/HorizontalListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->setValue()V
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$4;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 116
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 239
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 231
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 233
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$5;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/MyUserCneterActivity$5;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 152
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 153
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
}}
