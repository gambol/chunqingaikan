package com.twocloo.com.cn.activitys; class EditProfileActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "EditProfileActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CAMERA_REQUEST_CODE:I = 0x7d2
a=0;// 
a=0;// .field private static final CROP_REQUEST_CODE:I = 0x7d4
a=0;// 
a=0;// .field private static final EDIT_AGE:I = 0x3ea
a=0;// 
a=0;// .field private static final EDIT_QIANMING:I = 0x3eb
a=0;// 
a=0;// .field private static final EDIT_USER_NAME:I = 0x3e9
a=0;// 
a=0;// .field private static final IMAGE_REQUEST_CODE:I = 0x7d3
a=0;// 
a=0;// .field public static uploadIconSuccessed:Z
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private add_image:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private ageLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private agetexTextView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private biaoLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;// .field private biaoqianLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private canDialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private complete:Landroid/widget/TextView;
a=0;// 
a=0;// .field private dayBirth:I
a=0;// 
a=0;// .field private dayNow:I
a=0;// 
a=0;// .field private dialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private line1:Landroid/view/View;
a=0;// 
a=0;// .field private line2:Landroid/view/View;
a=0;// 
a=0;// .field private line3:Landroid/view/View;
a=0;// 
a=0;// .field private line4:Landroid/view/View;
a=0;// 
a=0;// .field private line5:Landroid/view/View;
a=0;// 
a=0;// .field private line6:Landroid/view/View;
a=0;// 
a=0;// .field private line7:Landroid/view/View;
a=0;// 
a=0;// .field private mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mark:Ljava/lang/String;
a=0;// 
a=0;// .field private monthBirth:I
a=0;// 
a=0;// .field private monthNow:I
a=0;// 
a=0;// .field private new_sign:Ljava/lang/String;
a=0;// 
a=0;// .field private nickname:Landroid/widget/TextView;
a=0;// 
a=0;// .field private nicknameLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private nicknameString:Ljava/lang/String;
a=0;// 
a=0;// .field private photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private profileImageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private qianming:Landroid/widget/TextView;
a=0;// 
a=0;// .field private qianmingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private sex:Landroid/widget/TextView;
a=0;// 
a=0;// .field private sexLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private sex_id:I
a=0;// 
a=0;// .field private signString:Ljava/lang/String;
a=0;// 
a=0;// .field private stars:[Ljava/lang/String;
a=0;// 
a=0;// .field private text_qianming:Ljava/lang/String;
a=0;// 
a=0;// .field private text_username:Ljava/lang/String;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private txt_age:Ljava/lang/String;
a=0;// 
a=0;// .field private txt_sex:Ljava/lang/String;
a=0;// 
a=0;// .field private txt_xingzuo:Ljava/lang/String;
a=0;// 
a=0;// .field private txtnickname:Ljava/lang/String;
a=0;// 
a=0;// .field private uid:Ljava/lang/String;
a=0;// 
a=0;// .field private user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;// .field private userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;// .field private user_logo:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;// .field private xingzuo:Landroid/widget/TextView;
a=0;// 
a=0;// .field private xingzuolayou:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// .field private yearBirth:I
a=0;// 
a=0;// .field private yearNow:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uploadIconSuccessed:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .line 66
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->canDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 68
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 79
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "\u9b54\u7faf\u5ea7"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "\u6c34\u74f6\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "\u53cc\u9c7c\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v2, "\u767d\u7f8a\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     const-string v2, "\u91d1\u725b\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const-string v2, "\u53cc\u5b50\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x6
a=0;// 
a=0;//     const-string v2, "\u5de8\u87f9\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x7
a=0;// 
a=0;//     const-string v2, "\u72ee\u5b50\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     const-string v2, "\u5904\u5973\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     const-string v2, "\u5929\u79e4\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     const-string v2, "\u5929\u874e\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     const-string v2, "\u5c04\u624b\u5ea7"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->stars:[Ljava/lang/String;
a=0;// 
a=0;//     .line 92
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     .line 93
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$1;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/activitys/EditProfileActivity;Lcom/twocloo/com/cn/beans/UserCenterNewbean;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$10(Lcom/twocloo/com/cn/activitys/EditProfileActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearNow:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$11(Lcom/twocloo/com/cn/activitys/EditProfileActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthNow:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$12(Lcom/twocloo/com/cn/activitys/EditProfileActivity;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayNow:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$13(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$14(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->agetexTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$15(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuo:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$16(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)[Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->stars:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$17(Lcom/twocloo/com/cn/activitys/EditProfileActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mark:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$18(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mark:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$19(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userbean:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/UserCenterNewbean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$20(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$21(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$22(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$23(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->canDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$24(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/app/Dialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$25(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getPicFromCapture()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$26(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getPicFromAlbum()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$27(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Lcom/twocloo/com/cn/beans/User;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$28(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$29(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$30(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iget v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayBirth:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/activitys/EditProfileActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameString:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nickname:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$6(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameString:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$7(Lcom/twocloo/com/cn/activitys/EditProfileActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->signString:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$8(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->signString:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$9(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianming:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getImageUri()Landroid/net/Uri;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "2clooheader.jpg"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getPicFromAlbum()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 503
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 504
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "image/*"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 505
a=0;//     const-string v2, "android.intent.action.GET_CONTENT"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 506
a=0;//     const/16 v2, 0x7d3
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 510
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 507
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 508
a=0;//     .local v0, "e":Landroid/content/ActivityNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/ActivityNotFoundException;);
a=0;//     invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getPicFromCapture()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.media.action.IMAGE_CAPTURE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 461
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.media.action.IMAGE_CAPTURE"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 462
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     const-string v2, "output"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getImageUri()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 465
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/16 v2, 0x7d2
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 470
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 466
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 467
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private intiview()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biapqioanButtonLayoput:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 199
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->edit_complete:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 200
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     .line 201
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     .line 202
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     .line 203
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaotian4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     .line 204
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 205
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->add_photo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->add_image:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 206
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->user_logo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user_logo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 207
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->main_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 208
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->xingzuo_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuolayou:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 209
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->age_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->ageLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 210
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->biaoqian_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqianLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 211
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nickname_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 212
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_xingzuo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuo:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 213
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_age:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->agetexTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 214
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_nickname:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nickname:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 215
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->sex_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sexLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 216
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->gexingqianming_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianmingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 217
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_sex:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 218
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->text_qianming:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianming:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 219
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 220
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line1:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     .line 221
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     .line 222
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line3:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     .line 223
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line4:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     .line 224
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line5:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     .line 225
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line6:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     .line 226
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->line7:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line7:Landroid/view/View;
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->add_image:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqianLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuolayou:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->ageLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 231
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sexLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianmingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 236
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDayOrNightMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mainLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setWhiteBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line1:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 433
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line2:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line3:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 435
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line4:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 436
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line5:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 437
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line6:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->line7:Landroid/view/View;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setMoreSetFengexianBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 440
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianmingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqianLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sexLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->ageLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 445
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuolayou:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setUserItemBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 446
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private showResizeImage(Landroid/content/Intent;)V
a=0;//     .locals 7
a=0;//     .param p1, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 539
a=0;//     .local v1, "extras":Landroid/os/Bundle;
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 540
a=0;//     const-string v4, "data"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/graphics/Bitmap;
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 541
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 542
a=0;//     new-instance v0, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 543
a=0;//     .local v0, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/BitmapDrawable;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user_logo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 547
a=0;//     .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "_"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "2clooicon.cach"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 548
a=0;//     .local v2, "fileName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->photo:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4, v5, v2}, Lcom/twocloo/com/cn/common/Util;->savePhotoToSd(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 550
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-direct {v3, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 552
a=0;//     .local v3, "iconFile":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/task/PostUsericonTask;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/task/PostUsericonTask;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, p0, v5, v6, v3}, Lcom/twocloo/com/cn/task/PostUsericonTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/task/PostUsericonTask;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     new-array v5, v5, [Ljava/lang/Void;
a=0;// 
a=0;//     #v5=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/task/PostUsericonTask;->execute([Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 554
a=0;//     .end local v2    # "fileName":Ljava/lang/String;
a=0;//     .end local v3    # "iconFile":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateUi()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 473
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 474
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     .line 475
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getNickname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->txtnickname:Ljava/lang/String;
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nickname:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->txtnickname:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/beans/User;->getProfileImage()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->profileImageBitmap:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 479
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v4, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "_"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "2clooicon.cach"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     .local v2, "iconFile":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 481
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 482
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user_logo:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     iget v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex_id:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V
a=0;// 
a=0;//     .line 493
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v5=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->uid:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v4, p0, v5, v6, v7}, Lcom/twocloo/com/cn/threads/UserInfoNewThread;-><init>(Landroid/app/Activity;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/threads/UserInfoNewThread;);
a=0;//     iput-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->userInfoThread:Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     invoke-virtual {v4}, Lcom/twocloo/com/cn/threads/UserInfoNewThread;->start()V
a=0;// 
a=0;//     .line 496
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v2    # "iconFile":Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 484
a=0;//     .restart local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v2    # "iconFile":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Reference,Ljava/io/File;);v3=(Uninit);v4=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 486
a=0;//     .local v3, "uri":Landroid/net/Uri;
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/ContentResolver;);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v4, v5}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 490
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user_logo:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 487
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 488
a=0;//     .local v1, "e":Ljava/io/FileNotFoundException;
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cropImage(Landroid/net/Uri;)V
a=0;//     .locals 5
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x140
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 518
a=0;//     #v3=(One);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "com.android.camera.action.CROP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 519
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "image/*"
a=0;// 
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 520
a=0;//     const-string v1, "crop"
a=0;// 
a=0;//     const-string v2, "true"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 521
a=0;//     const-string v1, "aspectX"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 522
a=0;//     const-string v1, "aspectY"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 523
a=0;//     const-string v1, "outputX"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 524
a=0;//     const-string v1, "outputY"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 525
a=0;//     const-string v1, "outputFormat"
a=0;// 
a=0;//     const-string v2, "JPEG"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 526
a=0;//     const-string v1, "noFaceDetection"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 527
a=0;//     const-string v1, "return-data"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 528
a=0;//     const/16 v1, 0x7d4
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 529
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public jdggeSex()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex_id:I
a=0;// 
a=0;//     .line 581
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 582
a=0;//     .local v0, "sexID":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 583
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nan:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex_id:I
a=0;// 
a=0;//     .line 588
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 584
a=0;//     :cond_1
a=0;//     #v1=(One);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     sget v1, Lcom/twocloo/com/cn/R$drawable;->usercentericon_nv:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sex_id:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onActivityResult(IILandroid/content/Intent;)V
a=0;//     .locals 12
a=0;//     .param p1, "requestCode"    # I
a=0;//     .param p2, "resultCode"    # I
a=0;//     .param p3, "data"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 342
a=0;//     #v8=(Null);
a=0;//     const/16 v5, 0x3ea
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-ne p2, v5, :cond_2
a=0;// 
a=0;//     .line 343
a=0;//     const-string v5, "age"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 344
a=0;//     .local v0, "age":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "constellation"
a=0;// 
a=0;//     invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 345
a=0;//     .local v1, "constellation":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "0"
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->agetexTextView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuo:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 349
a=0;//     const-string v5, "year"
a=0;// 
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearNow:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearBirth:I
a=0;// 
a=0;//     .line 350
a=0;//     const-string v5, "month"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthNow:I
a=0;// 
a=0;//     invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthBirth:I
a=0;// 
a=0;//     .line 351
a=0;//     const-string v5, "day"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayNow:I
a=0;// 
a=0;//     invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayBirth:I
a=0;// 
a=0;//     .line 427
a=0;//     .end local v0    # "age":Ljava/lang/String;
a=0;//     .end local v1    # "constellation":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 428
a=0;//     return-void
a=0;// 
a=0;//     .line 353
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(PosShort);v6=(Uninit);
a=0;//     const/16 v5, 0x3e9
a=0;// 
a=0;//     if-ne p1, v5, :cond_3
a=0;// 
a=0;//     .line 354
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 355
a=0;//     const-string v5, "edittext"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_username:Ljava/lang/String;
a=0;// 
a=0;//     .line 356
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_username:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nickname:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_username:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 360
a=0;//     :cond_3
a=0;//     #v5=(PosShort);v6=(Uninit);
a=0;//     const/16 v5, 0x3eb
a=0;// 
a=0;//     if-ne p1, v5, :cond_6
a=0;// 
a=0;//     .line 361
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 362
a=0;//     const-string v5, "edittext"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     .line 363
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 364
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->new_sign:Ljava/lang/String;
a=0;// 
a=0;//     .line 366
a=0;//     :cond_4
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 367
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-le v5, v6, :cond_5
a=0;// 
a=0;//     .line 368
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/16 v7, 0x9
a=0;// 
a=0;//     invoke-virtual {v6, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "..."
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     .line 370
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianming:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->text_qianming:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 373
a=0;//     :cond_6
a=0;//     #v5=(PosShort);v6=(Uninit);
a=0;//     const/16 v5, 0x7d2
a=0;// 
a=0;//     if-ne p1, v5, :cond_8
a=0;// 
a=0;//     .line 374
a=0;//     invoke-static {}, Lcom/twocloo/base/util/StorageUtils;->externalMemoryAvailable()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 375
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     const-string v6, "2clooheader.jpg"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 376
a=0;//     .local v4, "tempFile":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->cropImage(Landroid/net/Uri;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 378
a=0;//     .end local v4    # "tempFile":Ljava/io/File;
a=0;//     :cond_7
a=0;//     #v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     const-string v5, "\u672a\u627e\u5230SD\u5361"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v5, v8}, Lcom/twocloo/base/util/ViewUtils;->toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 380
a=0;//     :cond_8
a=0;//     #v5=(PosShort);
a=0;//     const/16 v5, 0x7d3
a=0;// 
a=0;//     if-ne p1, v5, :cond_9
a=0;// 
a=0;//     .line 381
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 382
a=0;//     invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p0, v5}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->cropImage(Landroid/net/Uri;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 383
a=0;//     :cond_9
a=0;//     #v5=(PosShort);
a=0;//     const/16 v5, 0x7d4
a=0;// 
a=0;//     if-ne p1, v5, :cond_a
a=0;// 
a=0;//     .line 384
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 385
a=0;//     invoke-direct {p0, p3}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->showResizeImage(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 387
a=0;//     :cond_a
a=0;//     const/16 v5, 0x3ed
a=0;// 
a=0;//     if-ne p1, v5, :cond_1
a=0;// 
a=0;//     .line 388
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 389
a=0;//     const-string v5, "mark"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iput-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mark:Ljava/lang/String;
a=0;// 
a=0;//     .line 390
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mark:Ljava/lang/String;
a=0;// 
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 391
a=0;//     .local v3, "marks":[Ljava/lang/String;
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     array-length v2, v3
a=0;// 
a=0;//     .line 392
a=0;//     .local v2, "length":I
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v9, :cond_b
a=0;// 
a=0;//     .line 393
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 394
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 395
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 397
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 398
a=0;//     :cond_b
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-ne v2, v10, :cond_c
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v9
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     :cond_c
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-ne v2, v11, :cond_d
a=0;// 
a=0;//     .line 406
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 409
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v9
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v10
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 413
a=0;//     :cond_d
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x4
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v2, v5, :cond_1
a=0;// 
a=0;//     .line 414
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian1:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v8
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 416
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian2:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v9
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 418
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 419
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian3:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v10
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 420
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Landroid/widget/Button;->setVisibility(I)V
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqian4:Landroid/widget/Button;
a=0;// 
a=0;//     aget-object v6, v3, v11
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 18
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->ageLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->xingzuolayou:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     new-instance v12, Landroid/content/Intent;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditAgeActivity;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v12, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 242
a=0;//     .local v12, "intent":Landroid/content/Intent;
a=0;//     #v12=(Reference,Landroid/content/Intent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearNow:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthNow:I
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayNow:I
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 243
a=0;//     const-string v1, "year"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->yearNow:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 244
a=0;//     const-string v1, "month"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->monthNow:I
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 245
a=0;//     const-string v1, "day"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dayNow:I
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 246
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 338
a=0;//     .end local v12    # "intent":Landroid/content/Intent;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 248
a=0;//     .restart local v12    # "intent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Reference,Landroid/content/Intent;);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 249
a=0;//     .local v9, "calendar":Ljava/util/Calendar;
a=0;//     #v9=(Reference,Ljava/util/Calendar;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v9, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 250
a=0;//     .local v17, "yearNow":I
a=0;//     #v17=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v9, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 251
a=0;//     .local v15, "monthNow":I
a=0;//     #v15=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     invoke-virtual {v9, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 252
a=0;//     .local v10, "dayNow":I
a=0;//     #v10=(Integer);
a=0;//     const-string v1, "year"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v12, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 253
a=0;//     const-string v1, "month"
a=0;// 
a=0;//     invoke-virtual {v12, v1, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 254
a=0;//     const-string v1, "day"
a=0;// 
a=0;//     invoke-virtual {v12, v1, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 255
a=0;//     const/16 v1, 0x3ea
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-virtual {v0, v12, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     .end local v9    # "calendar":Ljava/util/Calendar;
a=0;//     .end local v10    # "dayNow":I
a=0;//     .end local v12    # "intent":Landroid/content/Intent;
a=0;//     .end local v15    # "monthNow":I
a=0;//     .end local v17    # "yearNow":I
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);v9=(Uninit);v10=(Uninit);v12=(Uninit);v15=(Uninit);v17=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->biaoqianLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 259
a=0;//     new-instance v12, Landroid/content/Intent;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v12, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 260
a=0;//     .restart local v12    # "intent":Landroid/content/Intent;
a=0;//     #v12=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "mark"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->mark:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 261
a=0;//     const/16 v1, 0x3ed
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     .end local v12    # "intent":Landroid/content/Intent;
a=0;//     :cond_4
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);v2=(Uninit);v12=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 263
a=0;//     new-instance v12, Landroid/content/Intent;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v12, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 264
a=0;//     .restart local v12    # "intent":Landroid/content/Intent;
a=0;//     #v12=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     const-string v2, "\u6211\u7684\u6635\u79f0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 265
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const-string v2, "nicheng"
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 266
a=0;//     const-string v1, "info"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->nicknameString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 267
a=0;//     const/16 v1, 0x3e9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     .end local v12    # "intent":Landroid/content/Intent;
a=0;//     :cond_5
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);v2=(Uninit);v12=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->sexLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 269
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v13, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "\u7537"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v13, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "\u5973"
a=0;// 
a=0;//     aput-object v2, v13, v1
a=0;// 
a=0;//     .line 271
a=0;//     .local v13, "items":[Ljava/lang/String;
a=0;//     new-instance v1, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$drawable;->bianji:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 272
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0, v13}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;[Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$2;);
a=0;//     invoke-virtual {v1, v13, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 284
a=0;//     .local v11, "dialag":Landroid/app/AlertDialog;
a=0;//     #v11=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v11}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 285
a=0;//     .local v16, "window":Landroid/view/Window;
a=0;//     #v16=(Reference,Landroid/view/Window;);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setGravity(I)V
a=0;// 
a=0;//     .line 286
a=0;//     invoke-virtual/range {v16 .. v16}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 287
a=0;//     .local v14, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v14=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V
a=0;// 
a=0;//     .line 288
a=0;//     const v1, 0x3f4ccccd    # 0.8f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v14, Landroid/view/WindowManager$LayoutParams;->alpha:F
a=0;// 
a=0;//     .line 289
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {v11}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 291
a=0;//     .end local v11    # "dialag":Landroid/app/AlertDialog;
a=0;//     .end local v13    # "items":[Ljava/lang/String;
a=0;//     .end local v14    # "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     .end local v16    # "window":Landroid/view/Window;
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);v2=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->qianmingLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_7
a=0;// 
a=0;//     .line 292
a=0;//     new-instance v12, Landroid/content/Intent;
a=0;// 
a=0;//     #v12=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v12, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 293
a=0;//     .restart local v12    # "intent":Landroid/content/Intent;
a=0;//     #v12=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "title"
a=0;// 
a=0;//     const-string v2, "\u4e2a\u6027\u7b7e\u540d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 294
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const-string v2, "qianming"
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 295
a=0;//     const-string v1, "info"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->signString:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v12, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 297
a=0;//     const/16 v1, 0x3eb
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v12, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->startActivityForResult(Landroid/content/Intent;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     .end local v12    # "intent":Landroid/content/Intent;
a=0;//     :cond_7
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout;);v2=(Uninit);v12=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 300
a=0;//     const-string v2, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "\u662f\u5426\u4fdd\u5b58\u4fee\u6539\u4fe1\u606f\uff1f"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const-string v5, "\u6682\u4e0d"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "\u4fdd\u5b58"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/EditProfileActivity$3;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$3;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v7, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$3;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     .line 306
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$3;);
a=0;//     new-instance v8, Lcom/twocloo/com/cn/activitys/EditProfileActivity$4;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$4;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v8, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$4;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$4;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     .line 300
a=0;//     invoke-static/range {v1 .. v8}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->canDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     :cond_8
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->add_image:Landroid/widget/ImageView;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_9
a=0;// 
a=0;//     .line 314
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/EditProfileActivity$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$5;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v1, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$5;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     .line 320
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$5;);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/activitys/EditProfileActivity$6;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$6;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$6;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     .line 328
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$6;);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/activitys/EditProfileActivity$7;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$7;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$7;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     .line 314
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$7;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lcom/twocloo/com/cn/utils/CommonUtils;->modifyiconDialog(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 335
a=0;//     :cond_9
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->complete:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->savaData()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 187
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 188
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->edit_profile_avtivity:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->intiview()V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/common/CloseActivity;->add(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->jdggeSex()V
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->setTopLayout()V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-static {}, Lcom/twocloo/com/cn/activitys/BookApp;->getUser()Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->user:Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     .line 194
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->updateUi()V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 568
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 570
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 8
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 691
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 692
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "\u662f\u5426\u4fdd\u5b58\u4fee\u6539\u4fe1\u606f\uff1f"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "\u6682\u4e0d"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "\u4fdd\u5b58"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/EditProfileActivity$9;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$9;);
a=0;//     invoke-direct {v6, p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$9;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     .line 698
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$9;);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/activitys/EditProfileActivity$10;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$10;);
a=0;//     invoke-direct {v7, p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$10;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$10;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 692
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static/range {v0 .. v7}, Lcom/twocloo/com/cn/utils/CommonUtils;->myDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->canDialog:Landroid/app/Dialog;
a=0;// 
a=0;//     .line 706
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 575
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 577
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 450
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 451
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 452
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->setDayOrNightMode()V
a=0;// 
a=0;//     .line 453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public savaData()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 591
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "\u6b63\u5728\u4fdd\u5b58\u8d44\u6599\uff0c\u8bf7\u7a0d\u5019..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 593
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;-><init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 685
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 687
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTopLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getTopBackgroundColor(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 562
a=0;//     .local v0, "color":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 563
a=0;//     return-void
a=0;// .end method
}}
