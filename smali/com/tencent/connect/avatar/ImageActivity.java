package com.tencent.connect.avatar; class ImageActivity { void a() { int a;
a=0;// .class public Lcom/tencent/connect/avatar/ImageActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;,
a=0;//         Lcom/tencent/connect/avatar/ImageActivity$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private d:Landroid/os/Handler;
a=0;// 
a=0;// .field private e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;// .field private f:Landroid/widget/Button;
a=0;// 
a=0;// .field private g:Landroid/widget/Button;
a=0;// 
a=0;// .field private h:Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;// .field private i:Landroid/widget/TextView;
a=0;// 
a=0;// .field private j:Landroid/widget/ProgressBar;
a=0;// 
a=0;// .field private k:I
a=0;// 
a=0;// .field private l:Z
a=0;// 
a=0;// .field private m:J
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// .field private o:I
a=0;// 
a=0;// .field private p:I
a=0;// 
a=0;// .field private q:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private r:Ljava/lang/String;
a=0;// 
a=0;// .field private s:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private t:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private v:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// .field private w:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x280
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 72
a=0;//     #p0=(Reference,Lcom/tencent/connect/avatar/ImageActivity;);
a=0;//     iput v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I
a=0;// 
a=0;//     .line 73
a=0;//     iput-boolean v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z
a=0;// 
a=0;//     .line 74
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J
a=0;// 
a=0;//     .line 76
a=0;//     iput v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I
a=0;// 
a=0;//     .line 78
a=0;//     iput v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->o:I
a=0;// 
a=0;//     .line 79
a=0;//     iput v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->p:I
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 434
a=0;//     new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$2;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$2;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$2;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->t:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 462
a=0;//     new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$3;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$3;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 623
a=0;//     new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$5;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$5;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$5;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$5;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->v:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     .line 681
a=0;//     new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$6;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$6;);
a=0;//     invoke-direct {v0, p0}, Lcom/tencent/connect/avatar/ImageActivity$6;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$6;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->w:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Null);
a=0;//     new-instance v4, Landroid/graphics/BitmapFactory$Options;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/BitmapFactory$Options;);
a=0;//     invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V
a=0;// 
a=0;//     .line 95
a=0;//     #v4=(Reference,Landroid/graphics/BitmapFactory$Options;);
a=0;//     iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 97
a=0;//     #v5=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v2, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 99
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(One);v3=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {v2, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 107
a=0;//     const/high16 v6, 0x400000
a=0;// 
a=0;//     .line 109
a=0;//     #v6=(Integer);
a=0;//     iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I
a=0;// 
a=0;//     .line 112
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Integer);v7=(Conflicted);
a=0;//     mul-int v7, v3, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-gt v7, v6, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z
a=0;// 
a=0;//     .line 119
a=0;//     iput v1, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v1, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {v1, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);v2=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     .line 115
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     .line 116
a=0;//     mul-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Landroid/graphics/Rect;)Landroid/graphics/Rect;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()Landroid/view/View;
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/high16 v6, 0x41c00000    # 24.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v10, 0x41900000    # 18.0f
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 143
a=0;//     #v8=(Byte);
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v0, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 145
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v1, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 147
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-direct {v2, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 150
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     new-instance v3, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v3, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     iput-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 155
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v3, Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/connect/avatar/c;);
a=0;//     invoke-direct {v3, p0}, Lcom/tencent/connect/avatar/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     iput-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lcom/tencent/connect/avatar/c;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     sget-object v4, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView$ScaleType;);
a=0;//     invoke-virtual {v3, v4}, Lcom/tencent/connect/avatar/c;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 163
a=0;//     new-instance v3, Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/connect/avatar/b;);
a=0;//     invoke-direct {v3, p0}, Lcom/tencent/connect/avatar/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/connect/avatar/b;);
a=0;//     iput-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 166
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v3, v1, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 168
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     invoke-virtual {v3, v1, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/b;);
a=0;//     invoke-virtual {v1, v3}, Lcom/tencent/connect/avatar/b;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 174
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v3, 0x42a00000    # 80.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-direct {v1, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 178
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xe
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 182
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 186
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-static {p0, v6}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0, v6}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 188
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 189
a=0;//     const-string v3, "com.tencent.plus.logo.png"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 195
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/high16 v3, 0x40e00000    # 7.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 202
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 205
a=0;//     new-instance v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 206
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v3, 0x42700000    # 60.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-direct {v1, v8, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 210
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v3, 0xc
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 212
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 214
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 215
a=0;//     const-string v1, "com.tencent.plus.bar.png"
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 217
a=0;//     const/high16 v1, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v1}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v0, v1, v1, v1, v9}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 219
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$a;);
a=0;//     invoke-direct {v1, p0, p0}, Lcom/tencent/connect/avatar/ImageActivity$a;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Landroid/content/Context;)V
a=0;// 
a=0;//     .line 222
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/ImageActivity$a;);
a=0;//     const/high16 v3, 0x41600000    # 14.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 223
a=0;//     const/high16 v4, 0x40e00000    # 7.0f
a=0;// 
a=0;//     invoke-static {p0, v4}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 225
a=0;//     new-instance v5, Landroid/widget/Button;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v5, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Button;);
a=0;//     iput-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     .line 226
a=0;//     new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v6, 0x429c0000    # 78.0f
a=0;// 
a=0;//     invoke-static {p0, v6}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/high16 v7, 0x42340000    # 45.0f
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p0, v7}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-direct {v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 228
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     iget-object v6, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v6, v5}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     const-string v6, "\u53d6\u6d88"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v10}, Landroid/widget/Button;->setTextSize(F)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v3, v4, v3, v4}, Landroid/widget/Button;->setPadding(IIII)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Lcom/tencent/connect/avatar/ImageActivity$a;->b(Landroid/widget/Button;)V
a=0;// 
a=0;//     .line 237
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 239
a=0;//     new-instance v5, Landroid/widget/Button;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v5, p0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Button;);
a=0;//     iput-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     .line 240
a=0;//     new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/high16 v6, 0x429c0000    # 78.0f
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p0, v6}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     const/high16 v7, 0x42340000    # 45.0f
a=0;// 
a=0;//     invoke-static {p0, v7}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-direct {v5, v6, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 242
a=0;//     #v5=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v6, 0xb
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v5, v6, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v6, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v6, v5}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 245
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v10}, Landroid/widget/Button;->setTextSize(F)V
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v5, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v3, v4, v3, v4}, Landroid/widget/Button;->setPadding(IIII)V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     const-string v4, "\u9009\u53d6"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/tencent/connect/avatar/ImageActivity$a;->a(Landroid/widget/Button;)V
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 255
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 256
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 258
a=0;//     #v3=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v4, 0xd
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 260
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 261
a=0;//     const-string v3, "\u79fb\u52a8\u548c\u7f29\u653e"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 262
a=0;//     const/high16 v3, 0x40400000    # 3.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v3}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v1, v9, v3, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v1, v10}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 265
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 268
a=0;//     new-instance v0, Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ProgressBar;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     .line 269
a=0;//     new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 273
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     invoke-virtual {v0, v1, v8}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ProgressBar;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/avatar/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->h:Lcom/tencent/connect/avatar/b;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 577
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "key_error_code"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 578
a=0;//     const-string v1, "key_error_msg"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 579
a=0;//     const-string v1, "key_error_detail"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 580
a=0;//     const-string v1, "key_response"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 581
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 582
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0, v1, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 583
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/graphics/Bitmap;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     new-instance v0, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-direct {v0, p0, p0, v1}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 513
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->v:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Lcom/tencent/connect/avatar/ImageActivity$QQAvatarImp;->setAvator(Landroid/graphics/Bitmap;Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 514
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/connect/avatar/ImageActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$4;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity$4;-><init>(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/ImageActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 548
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcom/tencent/connect/avatar/ImageActivity;Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iput-boolean p1, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/graphics/Rect;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Reference,Landroid/content/res/AssetManager;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 134
a=0;//     #v2=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v2, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 139
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/io/IOException;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 136
a=0;//     :catch_0
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/IOException;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 137
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Reference,Ljava/io/IOException;);v3=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     :catch_1
a=0;//     #v1=(Null);v2=(Reference,Ljava/io/InputStream;);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 326
a=0;//     new-instance v0, Ljava/io/IOException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/IOException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "cannot read picture: \'"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "\'!"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     throw v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 337
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 338
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     .line 339
a=0;//     const-string v1, "\u56fe\u7247\u8bfb\u53d6\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8be5\u56fe\u7247\u662f\u5426\u6709\u6548"
a=0;// 
a=0;//     .line 340
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 341
a=0;//     const/4 v2, -0x5
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v1, v0}, Lcom/tencent/connect/avatar/ImageActivity;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 342
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V
a=0;// 
a=0;//     .line 354
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->t:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->u:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->a:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcom/tencent/connect/avatar/ImageActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/connect/avatar/ImageActivity$1;);
a=0;//     invoke-direct {v1, p0}, Lcom/tencent/connect/avatar/ImageActivity$1;-><init>(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/ImageActivity$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 383
a=0;//     return-void
a=0;// 
a=0;//     .line 334
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->c(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0, p1, p2}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;I)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x11
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/high16 v5, 0x41800000    # 16.0f
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 551
a=0;//     #v6=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 552
a=0;//     #v2=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->getView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 553
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 554
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3, v6, v6, v6}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/ImageView;);
a=0;//     invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 556
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-static {p0, v5}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p0, v5}, Lcom/tencent/connect/avatar/a;->a(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 558
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 559
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     const-string v3, "com.tencent.plus.ic_success.png"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 566
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, v1, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 567
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 568
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 569
a=0;//     invoke-virtual {v2, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 570
a=0;//     invoke-virtual {v2, v7, v6, v6}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     .line 571
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 572
a=0;//     return-void
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     const-string v3, "com.tencent.plus.ic_error.png"
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/tencent/connect/avatar/ImageActivity;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/avatar/c;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 473
a=0;//     #v7=(Null);
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Rect;->width()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     .line 474
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/connect/avatar/c;->getImageMatrix()Landroid/graphics/Matrix;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 475
a=0;//     #v3=(Reference,Landroid/graphics/Matrix;);
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [F
a=0;// 
a=0;//     .line 476
a=0;//     #v1=(Reference,[F);
a=0;//     invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->getValues([F)V
a=0;// 
a=0;//     .line 477
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aget v2, v1, v2
a=0;// 
a=0;//     .line 478
a=0;//     #v2=(Integer);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     aget v4, v1, v4
a=0;// 
a=0;//     .line 479
a=0;//     #v4=(Integer);
a=0;//     aget v6, v1, v7
a=0;// 
a=0;//     .line 480
a=0;//     #v6=(Integer);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->o:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float v0, v1, v0
a=0;// 
a=0;//     .line 481
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v1, v1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v1, v2
a=0;// 
a=0;//     div-float/2addr v1, v6
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     .line 482
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->q:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v2, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float/2addr v2, v4
a=0;// 
a=0;//     div-float/2addr v2, v6
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     .line 483
a=0;//     #v2=(Integer);
a=0;//     new-instance v5, Landroid/graphics/Matrix;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Matrix;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V
a=0;// 
a=0;//     .line 484
a=0;//     #v5=(Reference,Landroid/graphics/Matrix;);
a=0;//     invoke-virtual {v5, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual {v5, v0, v0}, Landroid/graphics/Matrix;->postScale(FF)Z
a=0;// 
a=0;//     .line 487
a=0;//     const v0, 0x44228000    # 650.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-float/2addr v0, v6
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     .line 488
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v3, v1
a=0;// 
a=0;//     invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 490
a=0;//     iget-object v4, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v2
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 494
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->o:I
a=0;// 
a=0;//     iget v2, p0, Lcom/tencent/connect/avatar/ImageActivity;->p:I
a=0;// 
a=0;//     invoke-static {v0, v7, v7, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 497
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 503
a=0;//     invoke-direct {p0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 504
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/connect/avatar/ImageActivity;->d(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 608
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 609
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 610
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->i:Landroid/widget/TextView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 612
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->j:Landroid/widget/ProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ProgressBar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     const-string v0, "&gt;"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ">"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 616
a=0;//     const-string v1, "&lt;"
a=0;// 
a=0;//     const-string v2, "<"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 617
a=0;//     const-string v1, "&quot;"
a=0;// 
a=0;//     const-string v2, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 618
a=0;//     const-string v1, "&#39;"
a=0;// 
a=0;//     const-string v2, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 619
a=0;//     const-string v1, "&amp;"
a=0;// 
a=0;//     const-string v2, "&"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 620
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 586
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->finish()V
a=0;// 
a=0;//     .line 587
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 588
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 590
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->g:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 596
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I
a=0;// 
a=0;//     .line 597
a=0;//     new-instance v0, Lcom/tencent/connect/UserInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/UserInfo;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-direct {v0, p0, v1}, Lcom/tencent/connect/UserInfo;-><init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
a=0;// 
a=0;//     .line 598
a=0;//     #v0=(Reference,Lcom/tencent/connect/UserInfo;);
a=0;//     iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->w:Lcom/tencent/tauth/IUiListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/UserInfo;->getUserInfo(Lcom/tencent/tauth/IUiListener;)V
a=0;// 
a=0;//     .line 599
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->f:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->c()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lcom/tencent/connect/avatar/ImageActivity;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-boolean v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->l:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lcom/tencent/connect/avatar/ImageActivity;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic j(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic k(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic l(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic m(Lcom/tencent/connect/avatar/ImageActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     iget v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->k:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic n(Lcom/tencent/connect/avatar/ImageActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->e()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;J)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/utils/Util;->reportBernoulli(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
a=0;// 
a=0;//     .line 728
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setResult(I)V
a=0;// 
a=0;//     .line 422
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->d()V
a=0;// 
a=0;//     .line 423
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 388
a=0;//     #v0=(One);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 389
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 390
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setRequestedOrientation(I)V
a=0;// 
a=0;//     .line 391
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->a()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Lcom/tencent/connect/avatar/ImageActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 393
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->d:Landroid/os/Handler;
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual {p0}, Lcom/tencent/connect/avatar/ImageActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "key_params"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 397
a=0;//     const-string v1, "picture"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->r:Ljava/lang/String;
a=0;// 
a=0;//     .line 398
a=0;//     const-string v1, "return_activity"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 400
a=0;//     const-string v1, "appid"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 401
a=0;//     const-string v2, "access_token"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 402
a=0;//     const-string v3, "expires_in"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 403
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     const-string v5, "openid"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 404
a=0;//     const-string v6, "exitAnim"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->n:I
a=0;// 
a=0;//     .line 406
a=0;//     new-instance v0, Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/connect/auth/QQToken;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/connect/auth/QQToken;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/auth/QQToken;);
a=0;//     iput-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long/2addr v3, v6
a=0;// 
a=0;//     const-wide/16 v6, 0x3e8
a=0;// 
a=0;//     div-long/2addr v3, v6
a=0;// 
a=0;//     invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lcom/tencent/connect/auth/QQToken;->setAccessToken(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->b:Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/tencent/connect/auth/QQToken;->setOpenId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->b()V
a=0;// 
a=0;//     .line 414
a=0;//     invoke-direct {p0}, Lcom/tencent/connect/avatar/ImageActivity;->e()V
a=0;// 
a=0;//     .line 415
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->m:J
a=0;// 
a=0;//     .line 416
a=0;//     const-string v0, "10653"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 417
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->e:Lcom/tencent/connect/avatar/c;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/connect/avatar/c;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Lcom/tencent/connect/avatar/c;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity;->s:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 432
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
