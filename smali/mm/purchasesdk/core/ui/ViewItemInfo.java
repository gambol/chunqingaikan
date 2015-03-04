package mm.purchasesdk.core.ui; class ViewItemInfo { void a() { int a;
a=0;// .class public Lmm/purchasesdk/core/ui/ViewItemInfo;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Parcelable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lmm/purchasesdk/core/ui/ViewItemInfo$ViewItemInfoCreator;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final APPNAME:Ljava/lang/String; = "appname"
a=0;// 
a=0;// .field public static final COUNT:Ljava/lang/String; = "itemcount"
a=0;// 
a=0;// .field public static final CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;// .field public static final ITEM_PRICE:Ljava/lang/String; = "itemprice"
a=0;// 
a=0;// .field public static final KEY_COLOR:I = -0x7e7e7f
a=0;// 
a=0;// .field public static final PRODUCT:Ljava/lang/String; = "itemname"
a=0;// 
a=0;// .field public static final PROVIDER:Ljava/lang/String; = "provider"
a=0;// 
a=0;// .field public static final TOTAL_PRICE:Ljava/lang/String; = "totalprice"
a=0;// 
a=0;// .field public static final VALUE_BLACK:I = -0x1000000
a=0;// 
a=0;// .field public static final VALUE_BLUE:I = -0xffff01
a=0;// 
a=0;// .field public static final VALUE_GRAY:I = -0x7e7e7f
a=0;// 
a=0;// .field public static final VALUE_ORAGNE:I = -0x9a00
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public mID:Ljava/lang/String;
a=0;// 
a=0;// .field public mKey:Ljava/lang/String;
a=0;// 
a=0;// .field public mKeyColor:I
a=0;// 
a=0;// .field public mValue:Ljava/lang/String;
a=0;// 
a=0;// .field public mValueColor:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lmm/purchasesdk/core/ui/ViewItemInfo$ViewItemInfoCreator;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/core/ui/ViewItemInfo$ViewItemInfoCreator;);
a=0;//     invoke-direct {v0}, Lmm/purchasesdk/core/ui/ViewItemInfo$ViewItemInfoCreator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo$ViewItemInfoCreator;);
a=0;//     sput-object v0, Lmm/purchasesdk/core/ui/ViewItemInfo;->CREATOR:Landroid/os/Parcelable$Creator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/core/ui/ViewItemInfo;);
a=0;//     const v0, -0x7e7e7f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKeyColor:I
a=0;// 
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     iput v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public describeContents()I
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeToParcel(Landroid/os/Parcel;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKey:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValue:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mID:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mKeyColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     iget v0, p0, Lmm/purchasesdk/core/ui/ViewItemInfo;->mValueColor:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
