package com.ffcs.inapppaylib; class PayConfirmDialog { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PayConfirmDialog.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DIALOG_PAY_FAILURE:I = 0x3
a=0;// 
a=0;// .field private static final DIALOG_PAY_SUCCESS:I = 0x2
a=0;// 
a=0;// .field private static final DIALOG_VALIDATA:I = 0x1
a=0;// 
a=0;// .field private static payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private btnCancel:Landroid/widget/Button;
a=0;// 
a=0;// .field private btnOk:Landroid/widget/Button;
a=0;// 
a=0;// .field public dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field public isPaying:Z
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private msgHandle:Landroid/os/Handler;
a=0;// 
a=0;// .field private payCode:Ljava/lang/String;
a=0;// 
a=0;// .field private payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;// .field private proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;// .field private tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;// .field private validata:Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/ffcs/inapppaylib/PayConfirmDialog;Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->validata:Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payCode:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/ffcs/inapppaylib/PayConfirmDialog;Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     invoke-direct {p0, p1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->updateView(Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/ffcs/inapppaylib/PayConfirmDialog;ILjava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 380
a=0;//     invoke-direct {p0, p1, p2}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->showDialog(ILjava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->msgHandle:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getBorderText()Landroid/widget/TextView;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/high16 v5, 0x41200000    # 10.0f
a=0;// 
a=0;//     .line 296
a=0;//     #v5=(Integer);
a=0;//     new-instance v2, Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 297
a=0;//     .local v2, "text":Landroid/widget/TextView;
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     .line 298
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     .line 297
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 299
a=0;//     .local v1, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3, v5}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v0, "pad":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v6, v0, v6, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 301
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v3, v5}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 303
a=0;//     invoke-virtual {v2, v0, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 304
a=0;//     const/16 v3, 0x11
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 305
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     const/high16 v4, 0x41880000    # 17.0f
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 306
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static getPayDialog(Landroid/content/Context;Landroid/os/Handler;)Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;//     .locals 2
a=0;//     .param p0, "mContext"    # Landroid/content/Context;
a=0;//     .param p1, "msgHandle"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     new-instance v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-direct {v0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     sput-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->isPaying:Z
a=0;// 
a=0;//     .line 74
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iput-object p0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 75
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     invoke-static {p0}, Lcom/ffcs/inapppaylib/PayHelper;->getInstance(Landroid/content/Context;)Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayHelper;);
a=0;//     iput-object v1, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     .line 76
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iput-object p1, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->msgHandle:Landroid/os/Handler;
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->initView()V
a=0;// 
a=0;//     .line 78
a=0;//     sget-object v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payConfirmDialog:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getPromptText()Landroid/widget/TextView;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 287
a=0;//     .local v1, "text":Landroid/widget/TextView;
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v3, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 288
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     .line 287
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 289
a=0;//     .local v0, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 290
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 291
a=0;//     const-string v2, "#7F8C8D"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 292
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private getRow()Landroid/widget/LinearLayout;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 277
a=0;//     .local v0, "llRow":Landroid/widget/LinearLayout;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 279
a=0;//     .local v1, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v3, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v4, v2, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 281
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 282
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getTopLayout()Landroid/widget/LinearLayout;
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v12, 0x11
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     .line 238
a=0;//     #v10=(Byte);
a=0;//     new-instance v6, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v6, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 239
a=0;//     .local v6, "top":Landroid/widget/LinearLayout;
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 241
a=0;//     new-instance v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 244
a=0;//     .local v1, "logoLayout":Landroid/widget/LinearLayout;
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v9, "iapImageRes/tp01.png"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {v8}, Lcom/ffcs/inapppaylib/util/StreamPaser;->bitmap2Drawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 246
a=0;//     invoke-virtual {v1, v12}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v4, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 248
a=0;//     #v4=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v9, 0x42480000    # 50.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v8, v9}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 247
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v4, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 249
a=0;//     .local v4, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ImageView;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 252
a=0;//     .local v0, "logo":Landroid/widget/ImageView;
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 253
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v9, 0x420c0000    # 35.0f
a=0;// 
a=0;//     invoke-static {v8, v9}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 252
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v2, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 254
a=0;//     .local v2, "p":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 255
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 256
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     const-string v9, "iapImageRes/logo.png"
a=0;// 
a=0;//     .line 255
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 259
a=0;//     invoke-virtual {v6, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 261
a=0;//     new-instance v5, Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/TextView;);
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v5, v8}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 262
a=0;//     .local v5, "title":Landroid/widget/TextView;
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     new-instance v7, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .line 263
a=0;//     #v7=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v8, -0x2
a=0;// 
a=0;//     .line 262
a=0;//     #v8=(Byte);
a=0;//     invoke-direct {v7, v10, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 264
a=0;//     .local v7, "tvp":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v7=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v8, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v9, 0x41400000    # 12.0f
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v8, v9}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 266
a=0;//     .local v3, "pad":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v5, v11, v3, v11, v3}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 267
a=0;//     const-string v8, "\u624b\u673a\u652f\u4ed8"
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-virtual {v5, v12}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 269
a=0;//     const-string v8, "#BDC3C7"
a=0;// 
a=0;//     invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/TextView;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 272
a=0;//     return-object v6
a=0;// .end method
a=0;// 
a=0;// .method private showDialog(ILjava/lang/String;)V
a=0;//     .locals 18
a=0;//     .param p1, "type"    # I
a=0;//     .param p2, "message"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v15=(Reference,Landroid/app/Dialog;);
a=0;//     if-eqz v15, :cond_0
a=0;// 
a=0;//     .line 382
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v15}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 384
a=0;//     :cond_0
a=0;//     new-instance v4, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v4, v15}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 386
a=0;//     .local v4, "builder":Landroid/app/AlertDialog$Builder;
a=0;//     #v4=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     new-instance v8, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v8, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 387
a=0;//     .local v8, "layout":Landroid/widget/LinearLayout;
a=0;//     #v8=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     invoke-virtual {v8, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 388
a=0;//     const-string v15, "#ffffff"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v8, v15}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 389
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getTopLayout()Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v8, v15}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 391
a=0;//     new-instance v5, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v5, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 392
a=0;//     .local v5, "content":Landroid/widget/LinearLayout;
a=0;//     #v5=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v16, 0x42200000    # 40.0f
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 393
a=0;//     .local v10, "pad":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v16, 0x41200000    # 10.0f
a=0;// 
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 394
a=0;//     .local v11, "padl":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v5, v11, v10, v11, v10}, Landroid/widget/LinearLayout;->setPadding(IIII)V
a=0;// 
a=0;//     .line 395
a=0;//     const/16 v15, 0x11
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v5, v15}, Landroid/widget/LinearLayout;->setGravity(I)V
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {v8, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 398
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 399
a=0;//     .local v12, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Null);
a=0;//     new-instance v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v7, v15}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 400
a=0;//     .local v7, "icon":Landroid/widget/ImageView;
a=0;//     #v7=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const/high16 v16, 0x420c0000    # 35.0f
a=0;// 
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 401
a=0;//     .local v14, "w":I
a=0;//     #v14=(Integer);
a=0;//     new-instance v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .end local v12    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v12, v14, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 402
a=0;//     .restart local v12    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 403
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v15, :cond_1
a=0;// 
a=0;//     .line 404
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 405
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     const-string v16, "iapImageRes/tb01.png"
a=0;// 
a=0;//     .line 404
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v7, v15}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 410
a=0;//     :goto_0
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 412
a=0;//     new-instance v6, Landroid/widget/TextView;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v6, v15}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 413
a=0;//     .local v6, "hint":Landroid/widget/TextView;
a=0;//     #v6=(Reference,Landroid/widget/TextView;);
a=0;//     const/high16 v15, 0x41a00000    # 20.0f
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v6, v15}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 414
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 415
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 417
a=0;//     new-instance v3, Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v15}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 418
a=0;//     .local v3, "btn":Landroid/widget/Button;
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     const-string v15, "#2980B9"
a=0;// 
a=0;//     invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v3, v15}, Landroid/widget/Button;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 419
a=0;//     const-string v15, "#ffffff"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     invoke-virtual {v3, v15}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 420
a=0;//     const-string v15, "\u786e\u5b9a"
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v15}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 421
a=0;//     new-instance v15, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;
a=0;// 
a=0;//     #v15=(UninitRef,Lcom/ffcs/inapppaylib/PayConfirmDialog$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v15, v0, v1}, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;-><init>(Lcom/ffcs/inapppaylib/PayConfirmDialog;I)V
a=0;// 
a=0;//     #v15=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog$2;);
a=0;//     invoke-virtual {v3, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 430
a=0;//     new-instance v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     .end local v12    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v15, -0x1
a=0;// 
a=0;//     #v15=(Byte);
a=0;//     const/16 v16, -0x2
a=0;// 
a=0;//     #v16=(Byte);
a=0;//     const v17, 0x3dcccccd    # 0.1f
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     invoke-direct {v12, v15, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 431
a=0;//     .restart local v12    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v16, 0x41000000    # 8.0f
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v12, v10, v15, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 433
a=0;//     invoke-virtual {v3, v12}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 435
a=0;//     new-instance v2, Landroid/graphics/drawable/StateListDrawable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V
a=0;// 
a=0;//     .line 437
a=0;//     .local v2, "bg":Landroid/graphics/drawable/StateListDrawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     const-string v16, "iapImageRes/dlg_ok_normal.png"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 436
a=0;//     invoke-static {v15}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 439
a=0;//     .local v9, "normal":Landroid/graphics/drawable/Drawable;
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     const-string v16, "iapImageRes/dlg_ok_pressed.png"
a=0;// 
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 438
a=0;//     invoke-static {v15}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 440
a=0;//     .local v13, "pressed":Landroid/graphics/drawable/Drawable;
a=0;//     #v13=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     new-array v15, v15, [I
a=0;// 
a=0;//     #v15=(Reference,[I);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     const v17, 0x10100a7
a=0;// 
a=0;//     aput v17, v15, v16
a=0;// 
a=0;//     invoke-virtual {v2, v15, v13}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 441
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     new-array v15, v15, [I
a=0;// 
a=0;//     #v15=(Reference,[I);
a=0;//     invoke-virtual {v2, v15, v9}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 442
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {v8, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {v4, v8}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 448
a=0;//     return-void
a=0;// 
a=0;//     .line 407
a=0;//     .end local v2    # "bg":Landroid/graphics/drawable/StateListDrawable;
a=0;//     .end local v3    # "btn":Landroid/widget/Button;
a=0;//     .end local v6    # "hint":Landroid/widget/TextView;
a=0;//     .end local v9    # "normal":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v13    # "pressed":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v6=(Uninit);v9=(Uninit);v13=(Uninit);v15=(PosByte);v16=(Integer);v17=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v15, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 408
a=0;//     #v15=(Reference,Landroid/content/Context;);
a=0;//     const-string v16, "iapImageRes/tb02.png"
a=0;// 
a=0;//     .line 407
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v15 .. v16}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v7, v15}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateView(Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;//     .locals 8
a=0;//     .param p1, "ivalidata"    # Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;
a=0;// 
a=0;//     .prologue
a=0;//     const v7, -0x777778
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v6, 0x21
a=0;// 
a=0;//     .line 347
a=0;//     #v6=(PosByte);
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Button;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 349
a=0;//     new-instance v2, Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/text/SpannableStringBuilder;);
a=0;//     invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V
a=0;// 
a=0;//     .line 350
a=0;//     .local v2, "style":Landroid/text/SpannableStringBuilder;
a=0;//     #v2=(Reference,Landroid/text/SpannableStringBuilder;);
a=0;//     const-string v1, "\u63d0\u9192\uff1a\u672c\u6b21\u8d2d\u4e70\u5c06\u82b1\u8d39\u3010"
a=0;// 
a=0;//     .line 351
a=0;//     .local v1, "str":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 352
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-direct {v3, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 354
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getPrice()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u5143"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 356
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 357
a=0;//     .local v0, "start":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const/high16 v4, -0x10000
a=0;// 
a=0;//     invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 359
a=0;//     const-string v1, "\u3011\uff0c\u901a\u8fc7\u672c\u6708\u8bdd\u8d39\u652f\u4ed8\u3002\u70b9\u51fb\u3010"
a=0;// 
a=0;//     .line 360
a=0;//     invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 361
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 362
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-direct {v3, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 364
a=0;//     const-string v1, "\u786e\u8ba4"
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 367
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     const v4, -0xffff01
a=0;// 
a=0;//     invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 369
a=0;//     const-string v1, "\u3011\u5b8c\u6210\u8d2d\u4e70\u3002"
a=0;// 
a=0;//     .line 370
a=0;//     invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 372
a=0;//     new-instance v3, Landroid/text/style/ForegroundColorSpan;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-direct {v3, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/text/style/ForegroundColorSpan;);
a=0;//     invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 375
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getApp_name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p1}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getPay_code_name()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getPrice()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "\u5143"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 378
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkValidata(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "code"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payCode:Ljava/lang/String;
a=0;// 
a=0;//     .line 314
a=0;//     new-instance v0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ffcs/inapppaylib/PayConfirmDialog$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;-><init>(Lcom/ffcs/inapppaylib/PayConfirmDialog;)V
a=0;// 
a=0;//     .line 339
a=0;//     .local v0, "listener":Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog$1;);
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payCode:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Lcom/ffcs/inapppaylib/PayHelper;->checkValidata(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;)V
a=0;// 
a=0;//     .line 341
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public initView()V
a=0;//     .locals 34
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     new-instance v31, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 97
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/16 v32, 0x1
a=0;// 
a=0;//     #v32=(One);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 98
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "#ffffff"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getTopLayout()Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     .line 101
a=0;//     .local v26, "top":Landroid/widget/LinearLayout;
a=0;//     #v26=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, v26
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v24, Landroid/widget/ScrollView;
a=0;// 
a=0;//     #v24=(UninitRef,Landroid/widget/ScrollView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/ScrollView;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 104
a=0;//     .local v24, "scroll":Landroid/widget/ScrollView;
a=0;//     #v0=(Reference,Landroid/widget/ScrollView;);v24=(Reference,Landroid/widget/ScrollView;);
a=0;//     new-instance v5, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 105
a=0;//     .local v5, "content":Landroid/widget/LinearLayout;
a=0;//     #v5=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 106
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ScrollView;);
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 107
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v25, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v25=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 110
a=0;//     .local v25, "show":Landroid/widget/LinearLayout;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v25=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     .line 111
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v16, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v16=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, -0x1
a=0;// 
a=0;//     .line 114
a=0;//     #v31=(Byte);
a=0;//     const/16 v32, -0x2
a=0;// 
a=0;//     .line 113
a=0;//     #v32=(Byte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move/from16 v2, v32
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 115
a=0;//     .local v16, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v16=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v32, 0x41200000    # 10.0f
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 116
a=0;//     .local v13, "pad":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, 0x40800000    # 4.0f
a=0;// 
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 117
a=0;//     .local v14, "pad1":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v13, v13, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v27, Landroid/widget/TextView;
a=0;// 
a=0;//     #v27=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 120
a=0;//     .local v27, "tv":Landroid/widget/TextView;
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v27=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v31, "\u5c0a\u656c\u7684\u7528\u6237\uff0c\u60a8\u5373\u5c06\u8d2d\u4e70\uff1a"
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 121
a=0;//     const v31, -0x777778
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 122
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 123
a=0;//     const/high16 v31, 0x41900000    # 18.0f
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 124
a=0;//     const/16 v31, 0x20
a=0;// 
a=0;//     #v31=(PosByte);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V
a=0;// 
a=0;//     .line 125
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v17, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v17=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, -0x1
a=0;// 
a=0;//     #v31=(Byte);
a=0;//     const/16 v32, -0x2
a=0;// 
a=0;//     #v32=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move/from16 v2, v32
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 128
a=0;//     .local v17, "params1":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v17=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v13, v13, v13, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 130
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getRow()Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 131
a=0;//     .local v21, "row1":Landroid/widget/LinearLayout;
a=0;//     #v21=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v6, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-direct {v6, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 133
a=0;//     .local v6, "iv1":Landroid/widget/ImageView;
a=0;//     #v6=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/tb03.png"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 134
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v28, Landroid/widget/TextView;
a=0;// 
a=0;//     #v28=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 136
a=0;//     .local v28, "tv1":Landroid/widget/TextView;
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v28=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v31, "\u5e94\u7528\u540d\u79f0\uff1a"
a=0;// 
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 137
a=0;//     const v31, -0x777778
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 138
a=0;//     const/high16 v31, 0x41880000    # 17.0f
a=0;// 
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 139
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v28
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v31, Landroid/widget/TextView;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 141
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, -0x10000
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 142
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, 0x41880000    # 17.0f
a=0;// 
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 143
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvAppName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 146
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getRow()Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 147
a=0;//     .local v22, "row2":Landroid/widget/LinearLayout;
a=0;//     #v22=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 148
a=0;//     new-instance v7, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-direct {v7, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 149
a=0;//     .local v7, "iv2":Landroid/widget/ImageView;
a=0;//     #v7=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/tb03.png"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 150
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v29, Landroid/widget/TextView;
a=0;// 
a=0;//     #v29=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 152
a=0;//     .local v29, "tv2":Landroid/widget/TextView;
a=0;//     #v0=(Reference,Landroid/widget/TextView;);v29=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v31, "\u8ba1\u8d39\u5185\u5bb9\uff1a"
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 153
a=0;//     const v31, -0x777778
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 154
a=0;//     const/high16 v31, 0x41880000    # 17.0f
a=0;// 
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 155
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v29
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v31, Landroid/widget/TextView;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 157
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, -0x10000
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 158
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, 0x41880000    # 17.0f
a=0;// 
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 159
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayName:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 160
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 162
a=0;//     invoke-direct/range {p0 .. p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->getRow()Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     .line 163
a=0;//     .local v23, "row3":Landroid/widget/LinearLayout;
a=0;//     #v23=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 164
a=0;//     new-instance v8, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-direct {v8, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 165
a=0;//     .local v8, "iv3":Landroid/widget/ImageView;
a=0;//     #v8=(Reference,Landroid/widget/ImageView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/tb03.png"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->getImageFromAssets(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 166
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v30, Landroid/widget/TextView;
a=0;// 
a=0;//     #v30=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     invoke-direct/range {v30 .. v31}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 168
a=0;//     .local v30, "tv3":Landroid/widget/TextView;
a=0;//     #v30=(Reference,Landroid/widget/TextView;);
a=0;//     const-string v31, "\u8ba1\u8d39\u91d1\u989d\uff1a"
a=0;// 
a=0;//     invoke-virtual/range {v30 .. v31}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 169
a=0;//     const v31, -0x777778
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     invoke-virtual/range {v30 .. v31}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 170
a=0;//     const/high16 v31, 0x41880000    # 17.0f
a=0;// 
a=0;//     invoke-virtual/range {v30 .. v31}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 171
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, v30
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 172
a=0;//     new-instance v31, Landroid/widget/TextView;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 173
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, -0x10000
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 174
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, 0x41880000    # 17.0f
a=0;// 
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 175
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvPayCode:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     move-object/from16 v1, v31
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 176
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v18, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v18=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, -0x1
a=0;// 
a=0;//     .line 179
a=0;//     #v31=(Byte);
a=0;//     const/16 v32, -0x2
a=0;// 
a=0;//     .line 178
a=0;//     #v32=(Byte);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move/from16 v2, v32
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 180
a=0;//     .local v18, "params2":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v18=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v32, 0x41c80000    # 25.0f
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 181
a=0;//     .local v15, "pad2":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/high16 v32, 0x40a00000    # 5.0f
a=0;// 
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v13, v15, v13, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v31, Landroid/widget/TextView;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 184
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 185
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v0, v13, v13, v13, v13}, Landroid/widget/TextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 186
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/16 v32, 0x3
a=0;// 
a=0;//     #v32=(PosByte);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setGravity(I)V
a=0;// 
a=0;//     .line 187
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "#98F5FF"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 188
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "#2980B9"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 189
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "\u63d0\u9192\uff1a\u672c\u6b21\u8d2d\u4e70\u5c06\u82b1\u8d39\u3010\u3011\uff0c\u901a\u8fc7\u672c\u6708\u8bdd\u8d39\u652f\u4ed8\u3002\u70b9\u51fb\u3010\u786e\u8ba4\u3011\u5b8c\u6210\u8d2d\u4e70\u3002"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 190
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->tvBlance:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v9, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-direct {v9, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 193
a=0;//     .local v9, "ll":Landroid/widget/LinearLayout;
a=0;//     #v9=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v19, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v19=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, -0x1
a=0;// 
a=0;//     #v31=(Byte);
a=0;//     const/16 v32, -0x2
a=0;// 
a=0;//     #v32=(Byte);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move/from16 v1, v31
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     move/from16 v2, v32
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 194
a=0;//     .local v19, "params3":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout$LayoutParams;);v19=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v0, v13, v13, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 195
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v31, Landroid/widget/Button;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v31, Landroid/widget/Button;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     .line 199
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/16 v32, 0x0
a=0;// 
a=0;//     #v32=(Null);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 200
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "\u786e\u8ba4"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 201
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "\u53d6\u6d88"
a=0;// 
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v11, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v11=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     const/high16 v33, 0x42340000    # 45.0f
a=0;// 
a=0;//     #v33=(Integer);
a=0;//     invoke-static/range {v32 .. v33}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     const/high16 v33, 0x3f800000    # 1.0f
a=0;// 
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v32
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v33
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v11, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 203
a=0;//     .local v11, "p":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v11=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 204
a=0;//     new-instance v12, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Landroid/content/Context;);
a=0;//     const/high16 v33, 0x42340000    # 45.0f
a=0;// 
a=0;//     invoke-static/range {v32 .. v33}, Lcom/ffcs/inapppaylib/util/BitmapUtil;->dp2px(Landroid/content/Context;F)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     #v32=(Integer);
a=0;//     const/high16 v33, 0x3f800000    # 1.0f
a=0;// 
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v32
a=0;// 
a=0;//     move/from16 v2, v33
a=0;// 
a=0;//     invoke-direct {v12, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     .line 205
a=0;//     .local v12, "p1":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v12=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     const/16 v32, 0x0
a=0;// 
a=0;//     #v32=(Null);
a=0;//     const/16 v33, 0x0
a=0;// 
a=0;//     #v33=(Null);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     move/from16 v1, v32
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v33
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v12, v13, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     .line 206
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/widget/Button;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 207
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 208
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v4, Landroid/graphics/drawable/StateListDrawable;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     invoke-direct {v4}, Landroid/graphics/drawable/StateListDrawable;-><init>()V
a=0;// 
a=0;//     .line 212
a=0;//     .local v4, "bgOk":Landroid/graphics/drawable/StateListDrawable;
a=0;//     #v4=(Reference,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/btn_ok_normal.png"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     .line 211
a=0;//     invoke-static/range {v31 .. v31}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 214
a=0;//     .local v10, "normal":Landroid/graphics/drawable/Drawable;
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/btn_ok_pressed.png"
a=0;// 
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static/range {v31 .. v31}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 215
a=0;//     .local v20, "pressed":Landroid/graphics/drawable/Drawable;
a=0;//     #v20=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,[I);
a=0;//     const/16 v32, 0x0
a=0;// 
a=0;//     #v32=(Null);
a=0;//     const v33, 0x10100a7
a=0;// 
a=0;//     #v33=(Integer);
a=0;//     aput v33, v31, v32
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 216
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,[I);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v4, v0, v10}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 217
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 218
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const/16 v32, -0x1
a=0;// 
a=0;//     #v32=(Byte);
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/widget/Button;->setTextColor(I)V
a=0;// 
a=0;//     .line 220
a=0;//     new-instance v3, Landroid/graphics/drawable/StateListDrawable;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V
a=0;// 
a=0;//     .line 222
a=0;//     .local v3, "bgCancel":Landroid/graphics/drawable/StateListDrawable;
a=0;//     #v3=(Reference,Landroid/graphics/drawable/StateListDrawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/btn_cancel_normal.png"
a=0;// 
a=0;//     #v32=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     .line 221
a=0;//     invoke-static/range {v31 .. v31}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 224
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "iapImageRes/btn_cancel_pressed.png"
a=0;// 
a=0;//     invoke-static/range {v31 .. v32}, Lcom/ffcs/inapppaylib/util/FileUtil;->openAssetsFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v31
a=0;// 
a=0;//     .line 223
a=0;//     invoke-static/range {v31 .. v31}, Lcom/ffcs/inapppaylib/util/StreamPaser;->InputStream2Drawable(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     .line 225
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     #v31=(One);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,[I);
a=0;//     const/16 v32, 0x0
a=0;// 
a=0;//     #v32=(Null);
a=0;//     const v33, 0x10100a7
a=0;// 
a=0;//     aput v33, v31, v32
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 226
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     move/from16 v0, v31
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,[I);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v3, v0, v10}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 227
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 229
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 230
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v31, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v31=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     move-object/from16 v32, v0
a=0;// 
a=0;//     #v32=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v31 .. v32}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v31=(Reference,Landroid/app/ProgressDialog;);
a=0;//     move-object/from16 v0, v31
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-object v0, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 234
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     const-string v32, "\u8bf7\u7a0d\u7b49..."
a=0;// 
a=0;//     invoke-virtual/range {v31 .. v32}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 235
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 453
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnOk:Landroid/widget/Button;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setEnabled(Z)V
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->proDlg:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payHelper:Lcom/ffcs/inapppaylib/PayHelper;
a=0;// 
a=0;//     iget-object v3, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->validata:Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;
a=0;// 
a=0;//     #v3=(Reference,Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;);
a=0;//     invoke-virtual {v3}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getTrade_id()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 456
a=0;//     new-instance v4, Lcom/ffcs/inapppaylib/PayConfirmDialog$3;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/ffcs/inapppaylib/PayConfirmDialog$3;);
a=0;//     invoke-direct {v4, p0}, Lcom/ffcs/inapppaylib/PayConfirmDialog$3;-><init>(Lcom/ffcs/inapppaylib/PayConfirmDialog;)V
a=0;// 
a=0;//     .line 455
a=0;//     #v4=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog$3;);
a=0;//     invoke-virtual {v2, v3, v4}, Lcom/ffcs/inapppaylib/PayHelper;->confirmPayment(Ljava/lang/String;Lcom/ffcs/inapppaylib/PayHelper$OnPayListener;)V
a=0;// 
a=0;//     .line 500
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 488
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->btnCancel:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 489
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 492
a=0;//     new-instance v1, Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     invoke-direct {v1}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;-><init>()V
a=0;// 
a=0;//     .line 493
a=0;//     .local v1, "resp":Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/bean/response/PayResponse;);
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 494
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-virtual {v1, v2}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_code(I)V
a=0;// 
a=0;//     .line 495
a=0;//     const-string v2, "\u652f\u4ed8\u53d6\u6d88"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Lcom/ffcs/inapppaylib/bean/response/PayResponse;->setRes_message(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 496
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 497
a=0;//     const/16 v2, 0x125
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     iput v2, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 498
a=0;//     iget-object v2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->msgHandle:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showView(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "payCode"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->payCode:Ljava/lang/String;
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "build":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->rootLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 91
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
}}
