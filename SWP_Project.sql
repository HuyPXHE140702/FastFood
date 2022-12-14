USE [SWP_Project]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NULL,
	[Password] [nvarchar](50) NULL,
	[Displayname] [nvarchar](50) NULL,
	[Address] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[isAdmin] [bit] NULL,
	[isCustomer] [bit] NULL,
	[IsShipper] [bit] NULL,
	[IsSaller] [bit] NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[CategoryId] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[CategoryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Foods]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Foods](
	[FoodID] [int] IDENTITY(1,1) NOT NULL,
	[FoodName] [nvarchar](50) NULL,
	[CategoryID] [int] NULL,
	[Image] [nvarchar](max) NULL,
	[Quantity] [int] NULL,
	[UnitPrice] [float] NULL,
	[Description] [nvarchar](max) NULL,
	[Status] [bit] NULL,
	[DateCreated] [date] NULL,
 CONSTRAINT [PK_Foods] PRIMARY KEY CLUSTERED 
(
	[FoodID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Home]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Home](
	[id] [int] NOT NULL,
	[type] [nvarchar](50) NOT NULL,
	[title] [nvarchar](50) NOT NULL,
	[imgLink] [nvarchar](50) NOT NULL,
	[shortContent] [nvarchar](max) NOT NULL,
	[fullContent] [nvarchar](max) NOT NULL,
	[createDate] [date] NOT NULL,
	[like] [int] NOT NULL,
	[comment] [int] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Information]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Information](
	[id] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[age] [int] NOT NULL,
	[imgLink] [nvarchar](50) NOT NULL,
	[description] [nvarchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Message]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Message](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[message] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Message] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[OrderID] [int] NULL,
	[NameFood] [nvarchar](max) NULL,
	[ImageFood] [nvarchar](max) NULL,
	[PriceFood] [float] NULL,
	[Quantity] [int] NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[account_id] [int] NULL,
	[Name] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[TotalPrice] [float] NULL,
	[SellerID] [int] NULL,
	[ShipperID] [int] NULL,
	[created_date] [date] NULL,
	[status] [bit] NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Seller]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Seller](
	[SallerID] [int] IDENTITY(1,1) NOT NULL,
	[SallerName] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[Phone] [nvarchar](50) NULL,
	[ReceiveMoney] [float] NULL,
	[AccountID] [int] NULL,
	[Status] [bit] NULL,
 CONSTRAINT [PK_Seller] PRIMARY KEY CLUSTERED 
(
	[SallerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Shipper]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipper](
	[ShipperID] [int] IDENTITY(1,1) NOT NULL,
	[SellerID] [int] NULL,
	[ShipperName] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[DeliveryMoney] [float] NULL,
	[AccountID] [int] NOT NULL,
	[Status] [bit] NULL,
 CONSTRAINT [PK_Shipper] PRIMARY KEY CLUSTERED 
(
	[ShipperID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Shipping]    Script Date: 11/9/2022 12:07:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Shipping](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[OrderID] [int] NULL,
	[Name] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[TotalPrice] [float] NULL,
	[Status] [bit] NULL,
 CONSTRAINT [PK_Shipping] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (10, N'dangtm', N'123', N'Dang Tran', N'Ha Noi', N'0454657683', 0, 1, 0, 0, 1)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (11, N'huypx', N'123', N'Huy Pham', N'Ha Noi', N'0336577960', 1, 0, 0, 0, 1)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (12, N'vinhnv', N'123', N'Vinh Nguyen', N'Ha Noi', N'0324556123', 0, 0, 0, 1, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (13, N'ship1', N'123', N'Shipper 1', N'Ha Noi', N'0232455619', 0, 0, 1, 0, 1)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (14, N'demo1', N'123', N'Demo1', N'HN', N'0123123123', 0, 1, 0, 0, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (15, N'demo2', N'123', N'Demo2', N'HN', N'1231231231', 0, 1, 0, 0, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (16, N'demo3', N'123', N'Demo3', N'HN', N'1231231233', 0, 1, 0, 0, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (17, N'demo4', N'123', N'Ship2', N'HN', N'0123012332', 0, 0, 1, 0, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (18, N'demo5', N'123', N'Demo5', N'Ha Noi', N'0345543236', 0, 1, 0, 0, 0)
INSERT [dbo].[Account] ([ID], [Username], [Password], [Displayname], [Address], [Phone], [isAdmin], [isCustomer], [IsShipper], [IsSaller], [status]) VALUES (19, N'demo6', N'123', N'Demo6', N'Hai Phong', N'0234234522', 0, 0, 1, 0, 0)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (1, N'Pizza')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (2, N'Breakfast')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (3, N'Burgers')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (4, N'Chicken & Sandwiches')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (5, N'Desserts & Shakes')
INSERT [dbo].[Category] ([CategoryId], [CategoryName]) VALUES (6, N'Beverages')
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Foods] ON 

INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (1, N'Hunting Pizza', 1, N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 500, 15, N'Classic marinara sauce, mozzarella, hunting sausages, salami, pickled gherkins, tomatoes, blue onion, garlic.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (2, N'Vegetarian Pizza', 1, N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 500, 12, N'The white pizza cream sauce, mozzarella, eggplant, zucchini, cherry tomatoes, spinach, garlic, and oregano.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (3, N'Tuna Bianco Pizza', 1, N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 500, 10, N'The white pizza cream sauce, mozzarella, tuna, blue onion, capers, oregano.
', 1, CAST(N'2021-06-15' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (4, N'Palermo Rosso Pizza', 1, N'https://palermo.if.ua/wp-content/uploads/2018/08/Palermo-rosso.png', 500, 16, N'Classic marinara sauce, mozzarella, spinach, mushrooms, smoked bacon.', 1, CAST(N'2022-02-10' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (5, N'Mexican Pizza', 1, N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 500, 13, N'Classic marinara sauce, mozzarella, fresh tomatoes, chili peppers, original Salami pepperoni.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (6, N'Roma Bianco', 1, N'https://palermo.if.ua/wp-content/uploads/2018/09/Roma-Bianco.png', 500, 12, N'The white pizza cream, mozzarella, bacon, chicken, pineapple, champignons, tomatoes, sesame seeds.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (7, N'Bacon, Egg & Cheese Biscuit', 2, N'https://www.hotnreadysandwiches.com/Images/Products-HD/bacon-egg-cheese-biscuit2.png', 500, 10, N'Sandwich features a warm, buttermilk biscuit brushed with real butter, thick cut Applewood smoked bacon, a fluffy folded egg', 1, CAST(N'0220-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (8, N'Egg McMuffin', 2, N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage-mcmuffin-with-egg.png', 500, 5, N'We place a freshly cracked Grade A egg on a toasted English Muffin topped with real butter and add lean Canadian bacon and melty American cheese. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (9, N'
Sausage McMuffin', 2, N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage_mcmuffin_deluxe_0.png', 500, 12, N'Recipe features a warm, freshly toasted English muffin, topped with a savory hot sausage patty and a slice of melty American cheese', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (10, N'Bacon, Egg & Cheese McGriddles', 2, N'https://www.mcdonalds.co.jp/product_images/264/8641-McGriddle-Bacon-Egg.png?20220523152418', 500, 11, N'Recipe features thick-cut Applewood smoked bacon, a fluffy folded egg, and a slice of melty American cheese', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (11, N'Sausage Burrito', 2, N'https://www.pngkit.com/png/full/19-195400_breakfast-burritos-png-svg-freeuse-stock-breakfast-burrito.png', 500, 16, N' It''s wrapped in a soft tortilla, making it the perfect grab and go breakfast.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (12, N'Big Mac', 3, N'https://www.pngall.com/wp-content/uploads/4/Mcdonalds-Ham-Burger.png', 500, 3, N'It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese for a 100% beef burger with a taste like no other. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (13, N'Double Quarter Pounder with Cheese', 3, N'https://i.pinimg.com/originals/9e/27/3d/9e273def50e7be3c5a9b36d5d90edb95.png', 500, 5, N'Each Double Quarter Pounder with Cheese features two quarter pound* 100% fresh beef burger patties that are hot.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (14, N'Quarter Pounder with Cheese Deluxe', 3, N'https://www.reviewstream.com/images_items/Q0Nt4Er2r.png', 500, 3, N'Seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (15, N'McDouble', 3, N'https://www.mcdonalds.eg/Cms_Data/Contents/En/Media/images/Menu/large-Image/McDouble.png', 500, 4, N'The classic McDouble burger stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (16, N'Quarter Pounder with Cheese Bacon', 3, N'https://res.cloudinary.com/sonic-drive-in/image/upload/c_fit,w_600,h_600,dpr_2,f_auto,q_auto/v1616178802/oa_menu/products/menuproduct_burger_bacon-double-cheeseburger.png', 500, 5, N' It''s a hot, deliciously juicy bacon cheeseburger, seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (17, N'Hamburger', 3, N'https://freepngimg.com/thumb/burger/2-2-burger-free-download-png-thumb.png', 500, 3, N'The original burger starts with a 100% pure beef burger seasoned with just a pinch of salt and pepper.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (18, N'Spicy Deluxe Crispy Chicken Sandwich', 4, N'https://images.ctfassets.net/a9odgsv44wmq/2n8v481xOhTqRKIXlZmgRt/04f937df298a830b933bf46a9127b7dc/Jacks_Spicy_Chicken_MenuImages.png', 500, 6, N'Our southern-style fried chicken fillet on a potato roll, topped with shredded lettuce, Roma tomatoes and Spicy Pepper Sauce', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (19, N'Crispy Chicken Sandwich', 4, N'https://images.ctfassets.net/o19mhvm9a2cm/31kKfUJcqOnkbmXz4JvS9d/c2cb01bbcbe6a2b0892e3c86bb851cb9/Website_Chicken_Classic.png?w=1500', 500, 6, N'It’s topped with crinkle-cut pickles and served on a toasted, buttered potato roll.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (20, N'
Spicy Crispy Chicken Sandwich', 4, N'https://images.getbento.com/accounts/0a6ca328d2a4178127fd36f1a142b8e4/media/neX2LHeGSSenM3wsSzCF_GrilledCK18.png?w=1000&fit=max&auto=compress,format&h=1000', 500, 5, N'With our Spicy Pepper Sauce topping the southern style fried chicken fillet on a toasted potato roll, it crispy, juicy, tender and hot.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (21, N'Chicken McNuggets', 4, N'https://pngpress.com/wp-content/uploads/2020/05/kisspng-burger-king-chicken-nuggets-chicken-fingers-mcdona-chicken-nugget-5b3d595fae4673.5748914615307472317138-300x200.png', 500, 2, N'Our tender, juicy Chicken McNuggets are made with all white meat chicken and no artificial colors, flavors or preservatives. ', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (22, N'McChicken', 4, N'https://www.pngkit.com/png/full/269-2692992_mcspicy-double-mcspicy-chicken-burger.png', 500, 3, N' Savor the satisfying crunch of our juicy chicken patty, topped with shredded lettuce and just the right amount of creamy mayonnaise', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (23, N'Filet-O-Fish', 4, N'https://i.warosu.org/data/ck/img/0111/12/1535194749494.png', 500, 3, N'This  fish sandwich has fish sourced from sustainably managed fisheries, on melty cheese and topped with creamy  sauce.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (24, N'Chocolatey Pretzel McFlurry', 5, N'https://www.mcdonalds.pt/media/4846/028_mcflurry_snickers_grande_new.png?anchor=center&mode=crop&width=210&height=210&rnd=132352386630000000', 500, 2, N'Creamy vanilla soft serve with caramel topping and chocolatey pretzel pieces blended throughout to satisfy your sweet and salty cravings.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (25, N'McFlurry with M&M''S Candies', 5, N'https://fastfoodedition.weebly.com/uploads/1/7/7/8/17789053/6521324_orig.png?164', 500, 2, N'The McDonald’s M&M  McFlurry is a sweet, creamy  dessert of vanilla soft serve with  chocolate candies swirled in.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (26, N'Chocolate Shake', 5, N'https://d1nqx6es26drid.cloudfront.net/app/uploads/2015/04/16032138/product-iced-chocolate.png', 500, 2, N' Our chocolate shake is made with delicious soft serve, chocolate syrup and finished off with a creamy whipped topping', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (27, N'Vanilla Shake', 5, N'https://i.pinimg.com/originals/25/cd/47/25cd47d18de3220f56ef4d65ce2123a5.png', 500, 3, N'Vanilla shake is made with our creamy vanilla soft serve and topped with whipped topping for a cool, tasty treat. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (28, N'Strawberry Shake', 5, N'https://www.pafootdoctors.com/media/k2/galleries/mcdonalds-strawberry-shake.png', 500, 3, N' Strawberry Shake is made with creamy vanilla soft serve, blended with strawberry syrup and topped with whipped topping.', 1, CAST(N'2022-02-12' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (29, N'
Hot Fudge Sundae', 5, N'https://149449860.v2.pressablecdn.com/wp-content/uploads/2019/06/Sundae.png', 500, 5, N'Our classic hot fudge sundae is made with creamy vanilla soft serve and smothered in chocolaty hot fudge topping. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (30, N'
Hot Caramel Sundae', 5, N'https://www.hungryjacks.com.au/Upload/HJ/Media/Menu/product/Main/2404_CaramelSundae.png', 500, 3, N'This Caramel Sundae combines creamy vanilla soft serve and warm, buttery caramel topping.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (31, N'Baked Apple Pie', 5, N'https://www.mcdonalds.com/content/dam/ArabiaGWS/english/nfl/Nutrition/Items/Regular/apple-pie.png', 500, 3, N'Baked Apple Pie recipe features 100% American-grown apples, and a lattice crust baked to perfection and topped with sprinkled sugar. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (32, N'Chocolate Chip Cookie', 5, N'https://www.downloadclipart.net/large/cookies-png-transparent-image.png', 500, 2, N'Classic chocolate chip cookie, loaded with chocolate chips. It''s a soft baked cookie and warmed to perfection.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (33, N'Coca-Cola', 6, N'https://bk-apac-prd.s3.amazonaws.com/sites/burgerking.com.fj/files/BK_CocaCola_detail.png', 500, 2, N'Coca-Cola is a refreshing soda option that complements all of your menu favorites.', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (34, N'Sprite', 6, N'https://bk-apac-prd.s3.amazonaws.com/sites/burgerking.com.fj/files/BK_Sprite_detail.png', 500, 2, N'Sprite is a caffeine-free soda that makes the perfect addition to any your combo meal.', 1, CAST(N'2021-07-18' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (35, N'Dr Pepper', 6, N'https://images.ctfassets.net/a9odgsv44wmq/3NWUk7GaaZsODIMyZv06PW/ad8238a6e36211632ca3aa21e6fc0cec/MenuImage_DietDrPepper_Straight.png', 500, 2, N' Dr Pepper, the classic and refreshing fountain drink with a unique blend of 23 flavors. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (36, N'Fanta Orange', 6, N'http://assets.stickpng.com/images/58710037b8261606d1c863ef.png', 500, 2, N'Fanta Orange is a caffeine-free soft drink full of bubbly, refreshing orange flavor. ', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (37, N'Diet Coke', 6, N'https://www.dairyqueen.com/dA/aa368fe1a0/Diet-Coke.png', 500, 2, N'Fresh and always tasting the way they should by following the guidelines set by Coca-Cola, using a ratio of syrup that allows ice to melt', 1, CAST(N'2022-02-11' AS Date))
INSERT [dbo].[Foods] ([FoodID], [FoodName], [CategoryID], [Image], [Quantity], [UnitPrice], [Description], [Status], [DateCreated]) VALUES (38, N'Strawberry Banana Smoothie', 6, N'http://montrealmom.com/wp-content/uploads/2012/07/hero_mccafe-smoothie.png', 500, 2, N'Strawberry Banana Smoothie recipe features the perfect combination of fruit purees and fruit juices, such as strawberry and banana.', 1, CAST(N'2022-02-12' AS Date))
SET IDENTITY_INSERT [dbo].[Foods] OFF
GO
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (1, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2018-07-13' AS Date), 0, 0)
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (2, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2018-05-01' AS Date), 0, 0)
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (3, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2015-08-17' AS Date), 0, 0)
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (4, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2015-08-17' AS Date), 0, 0)
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (5, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2015-08-17' AS Date), 5, 0)
INSERT [dbo].[Home] ([id], [type], [title], [imgLink], [shortContent], [fullContent], [createDate], [like], [comment]) VALUES (6, N'fastfood', N'Best fast food meals for students', N'fast-food-1.png', N'Feeling bored and hungry? Smirk up Mark’s kitchen is just around the corner to please you', N'Student life is full of fun; it’s the only phase of life that you enjoy even when you have little money in your pocket. Students are too smart to cash the fun in diverse ways such as if it is to deal with hunger cravings then they manage anyway to get amused with the fast-food in a most convenient way.

The cafeteria of your school and college may not offer a great deal of variety on meals and that’s what ticks off your mood. When you don’t find something interesting, yummy, and affordable on the premises of your institution then naturally you go out and try to locate the scrumptious fast food near you.

So this time when you step out with a hungry stomach then approach the nearer Mark’s kitchen restaurant. Here you are going to find a lot of finger-licking fast food meals.

Fast-food meals to grab

Alfredo pasta

The very first look it leaves a beautiful smirk of your face and you feel the sudden urge to just nosh it on. This rich flavor pasta comes with skewed chicken with a cheesy sauce. This meal is going to makes you feel fuller and delighter.

Penne pasta

It will be a great choice to have penne pasta that leaves you mouth-smacked. It is fully packed with exotic tastes. If you often crave a white buttery sauce then the penne pasta of Mark’s kitchen is just the ticket for you.

Club sandwich

The club sandwich is a must item in fast food menus for students, club sandwiches with crispy fries give you no way to escape.

Pizza

Who can dare to ignore the existence of pizza? Try out the relishing flavor of Mark’s kitchen restaurant pizza that claims to drive your taste buds crazy.

Loaded fries

Fries are not just for kids, it’s the favorite pick of every age group. Munching the crispy loaded bites of fries will give you real fun.

So students get a load of it, no deep pockets required for making a way in Mark’s kitchen restaurant when economical fast food meals are ready to amuse you!

', CAST(N'2018-05-01' AS Date), 6, 9)
GO
INSERT [dbo].[Information] ([id], [name], [age], [imgLink], [description]) VALUES (1, N'Susan Stratton', 25, N'i284852689410723613._szw480h1280_.jpg', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi.')
GO
SET IDENTITY_INSERT [dbo].[Message] ON 

INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (1, N'JM Thuong', N'jmthuong97@gmail.com', N'ABC xyz')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (2, N'thuong', N'jmthuong97@gmail.com', N'as')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (3, N'name', N'jmthuong97@gmail.com', N'asasd')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (4, N'name', N'jmthuong97@gmail.com', N's')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (5, N'asd', N'jmthuong97@gma.com', N'asd')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (6, N'C', N'jmthuong97@gma.com', N'cfasd')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (7, N'                                                  ', N'jmthuong97@gma.com', N'                                        ')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (8, N'                   ', N'jmthuong97@gma.com', N'             ')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (9, N'                                                  ', N'jmthuong97@gma.com', N'                    ')
INSERT [dbo].[Message] ([id], [name], [email], [message]) VALUES (10, N'Huy Pham 1', N'pexxxboy@yahoo.com.vn', N'zxczxczxc')
SET IDENTITY_INSERT [dbo].[Message] OFF
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (1, 16, N'Hunting Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 15, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (2, 16, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (3, 16, N'Tuna Bianco Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 10, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (4, 17, N'Hunting Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 15, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (5, 17, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (6, 17, N'Tuna Bianco Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 10, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (7, 18, N'Hunting Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 15, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (8, 18, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (9, 18, N'Palermo Rosso Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/08/Palermo-rosso.png', 16, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (10, 18, N'Mexican Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 13, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (11, 19, N'Bacon, Egg & Cheese Biscuit', N'https://www.hotnreadysandwiches.com/Images/Products-HD/bacon-egg-cheese-biscuit2.png', 10, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (12, 19, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (13, 19, N'Egg McMuffin', N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage-mcmuffin-with-egg.png', 5, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (14, 19, N'
Sausage McMuffin', N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage_mcmuffin_deluxe_0.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (15, 20, N'Hunting Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 15, 3)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (16, 20, N'Palermo Rosso Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/08/Palermo-rosso.png', 16, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (17, 20, N'Mexican Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 13, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (18, 21, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (19, 21, N'Roma Bianco', N'https://palermo.if.ua/wp-content/uploads/2018/09/Roma-Bianco.png', 12, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (20, 21, N'Tuna Bianco Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 10, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (21, 22, N'Palermo Rosso Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/08/Palermo-rosso.png', 16, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (22, 22, N'Mexican Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 13, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (23, 22, N'Egg McMuffin', N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage-mcmuffin-with-egg.png', 5, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (24, 23, N'Tuna Bianco Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 10, 3)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (25, 23, N'Roma Bianco', N'https://palermo.if.ua/wp-content/uploads/2018/09/Roma-Bianco.png', 12, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (26, 23, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (27, 24, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 2)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (28, 24, N'Mexican Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 13, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (29, 24, N'Egg McMuffin', N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage-mcmuffin-with-egg.png', 5, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (30, 24, N'
Sausage McMuffin', N'https://mcdonalds.vn/uploads/2018/food/muffin/sausage_mcmuffin_deluxe_0.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (31, 25, N'Vegetarian Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Vegetarian-2.png', 12, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (32, 25, N'Tuna Bianco Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/07/tuna-bianko.png', 10, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (33, 25, N'Hunting Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Muslyvska.png', 15, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (34, 25, N'Palermo Rosso Pizza', N'https://palermo.if.ua/wp-content/uploads/2018/08/Palermo-rosso.png', 16, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (35, 25, N'Mexican Pizza', N'https://palermo.if.ua/wp-content/uploads/2017/03/Mexicana.png', 13, 1)
INSERT [dbo].[OrderDetail] ([ID], [OrderID], [NameFood], [ImageFood], [PriceFood], [Quantity]) VALUES (36, 25, N'Roma Bianco', N'https://palermo.if.ua/wp-content/uploads/2018/09/Roma-Bianco.png', 12, 1)
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[Orders] ON 

INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (16, 14, N'Demo 1', N'0234455678', N'Quang Ninh', 37, NULL, NULL, CAST(N'2022-11-01' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (17, 14, N'Demo 1 ', N'0234567781', N'Hai Phong', 47, NULL, 1, CAST(N'2022-11-02' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (18, 15, N'Demo 2', N'0354678975', N'Quang Ninh', 68, NULL, NULL, CAST(N'2022-11-03' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (19, 16, N'Demo 3', N'0994885776', N'Ha Noi', 39, NULL, NULL, CAST(N'2022-11-04' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (20, 14, N'Demo 1', N'0333444555', N'Da Nang', 87, NULL, NULL, CAST(N'2022-11-05' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (21, 15, N'Demo 3', N'0333445888', N'Can Tho', 58, NULL, NULL, CAST(N'2022-11-06' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (22, 16, N'Demo 3', N'0334566678', N'Hung Yen', 47, NULL, NULL, CAST(N'2022-11-07' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (23, 14, N'Demo 1', N'0546453336', N'Ha Noi', 66, NULL, NULL, CAST(N'2022-11-01' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (24, 15, N'Demo 2', N'0789654768', N'Hai Duong', 54, NULL, 1, CAST(N'2022-11-02' AS Date), 1)
INSERT [dbo].[Orders] ([OrderID], [account_id], [Name], [Phone], [Address], [TotalPrice], [SellerID], [ShipperID], [created_date], [status]) VALUES (25, 16, N'Demo 3', N'0333445678', N'Da Nang', 78, NULL, 1, CAST(N'2022-11-03' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Orders] OFF
GO
SET IDENTITY_INSERT [dbo].[Seller] ON 

INSERT [dbo].[Seller] ([SallerID], [SallerName], [Address], [Phone], [ReceiveMoney], [AccountID], [Status]) VALUES (1, N'Seller1', N'Ha Noi', N'0232314556', 10000, 10, 1)
SET IDENTITY_INSERT [dbo].[Seller] OFF
GO
SET IDENTITY_INSERT [dbo].[Shipper] ON 

INSERT [dbo].[Shipper] ([ShipperID], [SellerID], [ShipperName], [Phone], [Address], [DeliveryMoney], [AccountID], [Status]) VALUES (1, 1, N'Ship1', N'0432235143', N'Ha Noi', 0, 13, 1)
SET IDENTITY_INSERT [dbo].[Shipper] OFF
GO
ALTER TABLE [dbo].[Orders] ADD  CONSTRAINT [DF_Orders_created_date]  DEFAULT (getdate()) FOR [created_date]
GO
ALTER TABLE [dbo].[Foods]  WITH CHECK ADD  CONSTRAINT [FK_Foods_Category] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Category] ([CategoryId])
GO
ALTER TABLE [dbo].[Foods] CHECK CONSTRAINT [FK_Foods_Category]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Orders] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Orders]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Account] FOREIGN KEY([account_id])
REFERENCES [dbo].[Account] ([ID])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Account]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Seller] FOREIGN KEY([SellerID])
REFERENCES [dbo].[Seller] ([SallerID])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Seller]
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD  CONSTRAINT [FK_Orders_Shipper] FOREIGN KEY([ShipperID])
REFERENCES [dbo].[Shipper] ([ShipperID])
GO
ALTER TABLE [dbo].[Orders] CHECK CONSTRAINT [FK_Orders_Shipper]
GO
ALTER TABLE [dbo].[Shipper]  WITH CHECK ADD  CONSTRAINT [FK_Shipper_Account] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([ID])
GO
ALTER TABLE [dbo].[Shipper] CHECK CONSTRAINT [FK_Shipper_Account]
GO
ALTER TABLE [dbo].[Shipper]  WITH CHECK ADD  CONSTRAINT [FK_Shipper_Seller] FOREIGN KEY([SellerID])
REFERENCES [dbo].[Seller] ([SallerID])
GO
ALTER TABLE [dbo].[Shipper] CHECK CONSTRAINT [FK_Shipper_Seller]
GO
ALTER TABLE [dbo].[Shipping]  WITH CHECK ADD  CONSTRAINT [FK_Shipping_OrderDetail] FOREIGN KEY([OrderID])
REFERENCES [dbo].[OrderDetail] ([ID])
GO
ALTER TABLE [dbo].[Shipping] CHECK CONSTRAINT [FK_Shipping_OrderDetail]
GO
ALTER TABLE [dbo].[Shipping]  WITH CHECK ADD  CONSTRAINT [FK_Shipping_Orders] FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[Shipping] CHECK CONSTRAINT [FK_Shipping_Orders]
GO
